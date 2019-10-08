package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build$VERSION;
import android.support.constraint.R$styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Strength;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Guideline;
import androidx.constraintlayout.solver.widgets.ResolutionAnchor;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {
    public class LayoutParams extends ViewGroup$MarginLayoutParams {
        class Table {
            public static final int ANDROID_ORIENTATION = 1;
            public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
            public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
            public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
            public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
            public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
            public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
            public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
            public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
            public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
            public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
            public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
            public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
            public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 0x20;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
            public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 0x2F;
            public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
            public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
            public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
            public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
            public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
            public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
            public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
            public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
            public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 0x30;
            public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
            public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 0x1F;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
            public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
            public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
            public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
            public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
            public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
            public static final int LAYOUT_GONE_MARGIN_END = 26;
            public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
            public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
            public static final int LAYOUT_GONE_MARGIN_START = 25;
            public static final int LAYOUT_GONE_MARGIN_TOP = 22;
            public static final int UNUSED;
            public static final SparseIntArray map;

            static {
                Table.map = new SparseIntArray();
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                Table.map.append(R$styleable.ConstraintLayout_Layout_android_orientation, 1);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 0x2F);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 0x30);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 0x1F);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 0x20);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                Table.map.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }

            private Table() {
                super();
            }
        }

        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        int dimensionRatioSide;
        float dimensionRatioValue;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
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
        public boolean helped;
        public float horizontalBias;
        public int horizontalChainStyle;
        boolean horizontalDimensionFixed;
        public float horizontalWeight;
        boolean isGuideline;
        boolean isHelper;
        boolean isInPlaceholder;
        public int leftToLeft;
        public int leftToRight;
        public int matchConstraintDefaultHeight;
        public int matchConstraintDefaultWidth;
        public int matchConstraintMaxHeight;
        public int matchConstraintMaxWidth;
        public int matchConstraintMinHeight;
        public int matchConstraintMinWidth;
        public float matchConstraintPercentHeight;
        public float matchConstraintPercentWidth;
        boolean needsBaseline;
        public int orientation;
        int resolveGoneLeftMargin;
        int resolveGoneRightMargin;
        int resolvedGuideBegin;
        int resolvedGuideEnd;
        float resolvedGuidePercent;
        float resolvedHorizontalBias;
        int resolvedLeftToLeft;
        int resolvedLeftToRight;
        int resolvedRightToLeft;
        int resolvedRightToRight;
        public int rightToLeft;
        public int rightToRight;
        public int startToEnd;
        public int startToStart;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        boolean verticalDimensionFixed;
        public float verticalWeight;
        ConstraintWidget widget;

        public LayoutParams(int arg5, int arg6) {
            super(arg5, arg6);
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
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1f;
            this.verticalWeight = -1f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1f;
            this.matchConstraintPercentHeight = 1f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(ViewGroup$LayoutParams arg6) {
            super(arg6);
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
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1f;
            this.verticalWeight = -1f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1f;
            this.matchConstraintPercentHeight = 1f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
        }

        public LayoutParams(Context arg10, AttributeSet arg11) {
            float v6_2;
            String v4_1;
            super(arg10, arg11);
            int v0 = -1;
            this.guideBegin = v0;
            this.guideEnd = v0;
            this.guidePercent = -1f;
            this.leftToLeft = v0;
            this.leftToRight = v0;
            this.rightToLeft = v0;
            this.rightToRight = v0;
            this.topToTop = v0;
            this.topToBottom = v0;
            this.bottomToTop = v0;
            this.bottomToBottom = v0;
            this.baselineToBaseline = v0;
            this.circleConstraint = v0;
            this.circleRadius = 0;
            this.circleAngle = 0f;
            this.startToEnd = v0;
            this.startToStart = v0;
            this.endToStart = v0;
            this.endToEnd = v0;
            this.goneLeftMargin = v0;
            this.goneTopMargin = v0;
            this.goneRightMargin = v0;
            this.goneBottomMargin = v0;
            this.goneStartMargin = v0;
            this.goneEndMargin = v0;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1f;
            this.verticalWeight = -1f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1f;
            this.matchConstraintPercentHeight = 1f;
            this.editorAbsoluteX = v0;
            this.editorAbsoluteY = v0;
            this.orientation = v0;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = v0;
            this.resolvedLeftToRight = v0;
            this.resolvedRightToLeft = v0;
            this.resolvedRightToRight = v0;
            this.resolveGoneLeftMargin = v0;
            this.resolveGoneRightMargin = v0;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            TypedArray v10 = arg10.obtainStyledAttributes(arg11, R$styleable.ConstraintLayout_Layout);
            int v11 = v10.getIndexCount();
            int v1;
            for(v1 = 0; v1 < v11; ++v1) {
                int v4 = v10.getIndex(v1);
                int v7 = -2;
                switch(Table.map.get(v4)) {
                    case 1: {
                        goto label_413;
                    }
                    case 2: {
                        goto label_405;
                    }
                    case 3: {
                        goto label_401;
                    }
                    case 4: {
                        goto label_389;
                    }
                    case 5: {
                        goto label_385;
                    }
                    case 6: {
                        goto label_381;
                    }
                    case 7: {
                        goto label_377;
                    }
                    case 8: {
                        goto label_369;
                    }
                    case 9: {
                        goto label_361;
                    }
                    case 10: {
                        goto label_353;
                    }
                    case 11: {
                        goto label_345;
                    }
                    case 12: {
                        goto label_337;
                    }
                    case 13: {
                        goto label_329;
                    }
                    case 14: {
                        goto label_321;
                    }
                    case 15: {
                        goto label_313;
                    }
                    case 16: {
                        goto label_305;
                    }
                    case 17: {
                        goto label_297;
                    }
                    case 18: {
                        goto label_289;
                    }
                    case 19: {
                        goto label_281;
                    }
                    case 20: {
                        goto label_273;
                    }
                    case 21: {
                        goto label_269;
                    }
                    case 22: {
                        goto label_265;
                    }
                    case 23: {
                        goto label_261;
                    }
                    case 24: {
                        goto label_257;
                    }
                    case 25: {
                        goto label_253;
                    }
                    case 26: {
                        goto label_249;
                    }
                    case 27: {
                        goto label_245;
                    }
                    case 28: {
                        goto label_241;
                    }
                    case 29: {
                        goto label_237;
                    }
                    case 30: {
                        goto label_233;
                    }
                    case 31: {
                        goto label_225;
                    }
                    case 32: {
                        goto label_217;
                    }
                    case 33: {
                        goto label_208;
                    }
                    case 34: {
                        goto label_199;
                    }
                    case 35: {
                        goto label_194;
                    }
                    case 36: {
                        goto label_185;
                    }
                    case 37: {
                        goto label_176;
                    }
                    case 38: {
                        goto label_171;
                    }
                    case 44: {
                        goto label_106;
                    }
                    case 45: {
                        goto label_102;
                    }
                    case 46: {
                        goto label_98;
                    }
                    case 47: {
                        goto label_95;
                    }
                    case 48: {
                        goto label_92;
                    }
                    case 49: {
                        goto label_88;
                    }
                    case 50: {
                        goto label_84;
                    }
                }

                goto label_416;
            label_353:
                this.rightToLeft = v10.getResourceId(v4, this.rightToLeft);
                if(this.rightToLeft != v0) {
                    goto label_416;
                }

                this.rightToLeft = v10.getInt(v4, v0);
                goto label_416;
            label_225:
                this.matchConstraintDefaultWidth = v10.getInt(v4, 0);
                if(this.matchConstraintDefaultWidth != 1) {
                    goto label_416;
                }

                Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                goto label_416;
            label_98:
                this.verticalWeight = v10.getFloat(v4, this.verticalWeight);
                goto label_416;
            label_102:
                this.horizontalWeight = v10.getFloat(v4, this.horizontalWeight);
                goto label_416;
            label_361:
                this.leftToRight = v10.getResourceId(v4, this.leftToRight);
                if(this.leftToRight != v0) {
                    goto label_416;
                }

                this.leftToRight = v10.getInt(v4, v0);
                goto label_416;
            label_233:
                this.verticalBias = v10.getFloat(v4, this.verticalBias);
                goto label_416;
            label_106:
                this.dimensionRatio = v10.getString(v4);
                this.dimensionRatioValue = NaNf;
                this.dimensionRatioSide = v0;
                if(this.dimensionRatio == null) {
                    goto label_416;
                }

                v4 = this.dimensionRatio.length();
                int v6 = this.dimensionRatio.indexOf(44);
                if(v6 <= 0 || v6 >= v4 - 1) {
                    v6 = 0;
                }
                else {
                    String v7_1 = this.dimensionRatio.substring(0, v6);
                    if(v7_1.equalsIgnoreCase("W")) {
                        this.dimensionRatioSide = 0;
                    }
                    else if(v7_1.equalsIgnoreCase("H")) {
                        this.dimensionRatioSide = 1;
                    }

                    ++v6;
                }

                v7 = this.dimensionRatio.indexOf(58);
                if(v7 >= 0 && v7 < v4 - 1) {
                    v4_1 = this.dimensionRatio.substring(v6, v7);
                    String v6_1 = this.dimensionRatio.substring(v7 + 1);
                    if(v4_1.length() <= 0) {
                    }
                    else if(v6_1.length() > 0) {
                        try {
                            float v4_2 = Float.parseFloat(v4_1);
                            v6_2 = Float.parseFloat(v6_1);
                            if(v4_2 <= 0f) {
                            }
                            else if(v6_2 <= 0f) {
                            }
                            else if(this.dimensionRatioSide == 1) {
                                this.dimensionRatioValue = Math.abs(v6_2 / v4_2);
                            }
                            else {
                                this.dimensionRatioValue = Math.abs(v4_2 / v6_2);
                            }
                        }
                        catch(NumberFormatException ) {
                        }
                    }
                    else {
                    }

                    goto label_416;
                }

                v4_1 = this.dimensionRatio.substring(v6);
                if(v4_1.length() <= 0) {
                    goto label_416;
                }

                try {
                    this.dimensionRatioValue = Float.parseFloat(v4_1);
                }
                catch(NumberFormatException ) {
                }

                goto label_416;
            label_237:
                this.horizontalBias = v10.getFloat(v4, this.horizontalBias);
                goto label_416;
            label_369:
                this.leftToLeft = v10.getResourceId(v4, this.leftToLeft);
                if(this.leftToLeft != v0) {
                    goto label_416;
                }

                this.leftToLeft = v10.getInt(v4, v0);
                goto label_416;
            label_241:
                this.constrainedHeight = v10.getBoolean(v4, this.constrainedHeight);
                goto label_416;
            label_245:
                this.constrainedWidth = v10.getBoolean(v4, this.constrainedWidth);
                goto label_416;
            label_377:
                this.guidePercent = v10.getFloat(v4, this.guidePercent);
                goto label_416;
            label_249:
                this.goneEndMargin = v10.getDimensionPixelSize(v4, this.goneEndMargin);
                goto label_416;
            label_381:
                this.guideEnd = v10.getDimensionPixelOffset(v4, this.guideEnd);
                goto label_416;
            label_253:
                this.goneStartMargin = v10.getDimensionPixelSize(v4, this.goneStartMargin);
                goto label_416;
            label_385:
                this.guideBegin = v10.getDimensionPixelOffset(v4, this.guideBegin);
                goto label_416;
            label_257:
                this.goneBottomMargin = v10.getDimensionPixelSize(v4, this.goneBottomMargin);
                goto label_416;
            label_389:
                v6_2 = 360f;
                this.circleAngle = v10.getFloat(v4, this.circleAngle) % v6_2;
                if(this.circleAngle >= 0f) {
                    goto label_416;
                }

                this.circleAngle = (v6_2 - this.circleAngle) % v6_2;
                goto label_416;
            label_261:
                this.goneRightMargin = v10.getDimensionPixelSize(v4, this.goneRightMargin);
                goto label_416;
            label_265:
                this.goneTopMargin = v10.getDimensionPixelSize(v4, this.goneTopMargin);
                goto label_416;
            label_269:
                this.goneLeftMargin = v10.getDimensionPixelSize(v4, this.goneLeftMargin);
                goto label_416;
            label_401:
                this.circleRadius = v10.getDimensionPixelSize(v4, this.circleRadius);
                goto label_416;
            label_273:
                this.endToEnd = v10.getResourceId(v4, this.endToEnd);
                if(this.endToEnd != v0) {
                    goto label_416;
                }

                this.endToEnd = v10.getInt(v4, v0);
                goto label_416;
            label_405:
                this.circleConstraint = v10.getResourceId(v4, this.circleConstraint);
                if(this.circleConstraint != v0) {
                    goto label_416;
                }

                this.circleConstraint = v10.getInt(v4, v0);
                goto label_416;
            label_281:
                this.endToStart = v10.getResourceId(v4, this.endToStart);
                if(this.endToStart != v0) {
                    goto label_416;
                }

                this.endToStart = v10.getInt(v4, v0);
                goto label_416;
            label_413:
                this.orientation = v10.getInt(v4, this.orientation);
                goto label_416;
            label_289:
                this.startToStart = v10.getResourceId(v4, this.startToStart);
                if(this.startToStart != v0) {
                    goto label_416;
                }

                this.startToStart = v10.getInt(v4, v0);
                goto label_416;
            label_297:
                this.startToEnd = v10.getResourceId(v4, this.startToEnd);
                if(this.startToEnd != v0) {
                    goto label_416;
                }

                this.startToEnd = v10.getInt(v4, v0);
                goto label_416;
            label_171:
                this.matchConstraintPercentHeight = Math.max(0f, v10.getFloat(v4, this.matchConstraintPercentHeight));
                goto label_416;
                try {
                label_176:
                    this.matchConstraintMaxHeight = v10.getDimensionPixelSize(v4, this.matchConstraintMaxHeight);
                }
                catch(Exception ) {
                    if(v10.getInt(v4, this.matchConstraintMaxHeight) != v7) {
                        goto label_416;
                    }

                    this.matchConstraintMaxHeight = v7;
                }

                goto label_416;
            label_305:
                this.baselineToBaseline = v10.getResourceId(v4, this.baselineToBaseline);
                if(this.baselineToBaseline != v0) {
                    goto label_416;
                }

                this.baselineToBaseline = v10.getInt(v4, v0);
                goto label_416;
            label_313:
                this.bottomToBottom = v10.getResourceId(v4, this.bottomToBottom);
                if(this.bottomToBottom != v0) {
                    goto label_416;
                }

                this.bottomToBottom = v10.getInt(v4, v0);
                goto label_416;
                try {
                label_185:
                    this.matchConstraintMinHeight = v10.getDimensionPixelSize(v4, this.matchConstraintMinHeight);
                }
                catch(Exception ) {
                    if(v10.getInt(v4, this.matchConstraintMinHeight) != v7) {
                        goto label_416;
                    }

                    this.matchConstraintMinHeight = v7;
                }

                goto label_416;
            label_321:
                this.bottomToTop = v10.getResourceId(v4, this.bottomToTop);
                if(this.bottomToTop != v0) {
                    goto label_416;
                }

                this.bottomToTop = v10.getInt(v4, v0);
                goto label_416;
            label_194:
                this.matchConstraintPercentWidth = Math.max(0f, v10.getFloat(v4, this.matchConstraintPercentWidth));
                goto label_416;
                try {
                label_199:
                    this.matchConstraintMaxWidth = v10.getDimensionPixelSize(v4, this.matchConstraintMaxWidth);
                }
                catch(Exception ) {
                    if(v10.getInt(v4, this.matchConstraintMaxWidth) != v7) {
                        goto label_416;
                    }

                    this.matchConstraintMaxWidth = v7;
                }

                goto label_416;
            label_329:
                this.topToBottom = v10.getResourceId(v4, this.topToBottom);
                if(this.topToBottom != v0) {
                    goto label_416;
                }

                this.topToBottom = v10.getInt(v4, v0);
                goto label_416;
                try {
                label_208:
                    this.matchConstraintMinWidth = v10.getDimensionPixelSize(v4, this.matchConstraintMinWidth);
                }
                catch(Exception ) {
                    if(v10.getInt(v4, this.matchConstraintMinWidth) != v7) {
                        goto label_416;
                    }

                    this.matchConstraintMinWidth = v7;
                }

                goto label_416;
            label_337:
                this.topToTop = v10.getResourceId(v4, this.topToTop);
                if(this.topToTop != v0) {
                    goto label_416;
                }

                this.topToTop = v10.getInt(v4, v0);
                goto label_416;
            label_84:
                this.editorAbsoluteY = v10.getDimensionPixelOffset(v4, this.editorAbsoluteY);
                goto label_416;
            label_88:
                this.editorAbsoluteX = v10.getDimensionPixelOffset(v4, this.editorAbsoluteX);
                goto label_416;
            label_345:
                this.rightToRight = v10.getResourceId(v4, this.rightToRight);
                if(this.rightToRight != v0) {
                    goto label_416;
                }

                this.rightToRight = v10.getInt(v4, v0);
                goto label_416;
            label_217:
                this.matchConstraintDefaultHeight = v10.getInt(v4, 0);
                if(this.matchConstraintDefaultHeight != 1) {
                }
                else {
                    Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    goto label_416;
                label_92:
                    this.verticalChainStyle = v10.getInt(v4, 0);
                    goto label_416;
                label_95:
                    this.horizontalChainStyle = v10.getInt(v4, 0);
                }

            label_416:
            }

            v10.recycle();
            this.validate();
        }

        public LayoutParams(LayoutParams arg7) {
            super(((ViewGroup$MarginLayoutParams)arg7));
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
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0f;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneStartMargin = -1;
            this.goneEndMargin = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.dimensionRatioValue = 0f;
            this.dimensionRatioSide = 1;
            this.horizontalWeight = -1f;
            this.verticalWeight = -1f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.matchConstraintDefaultWidth = 0;
            this.matchConstraintDefaultHeight = 0;
            this.matchConstraintMinWidth = 0;
            this.matchConstraintMinHeight = 0;
            this.matchConstraintMaxWidth = 0;
            this.matchConstraintMaxHeight = 0;
            this.matchConstraintPercentWidth = 1f;
            this.matchConstraintPercentHeight = 1f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            this.needsBaseline = false;
            this.isGuideline = false;
            this.isHelper = false;
            this.isInPlaceholder = false;
            this.resolvedLeftToLeft = -1;
            this.resolvedLeftToRight = -1;
            this.resolvedRightToLeft = -1;
            this.resolvedRightToRight = -1;
            this.resolveGoneLeftMargin = -1;
            this.resolveGoneRightMargin = -1;
            this.resolvedHorizontalBias = 0.5f;
            this.widget = new ConstraintWidget();
            this.helped = false;
            this.guideBegin = arg7.guideBegin;
            this.guideEnd = arg7.guideEnd;
            this.guidePercent = arg7.guidePercent;
            this.leftToLeft = arg7.leftToLeft;
            this.leftToRight = arg7.leftToRight;
            this.rightToLeft = arg7.rightToLeft;
            this.rightToRight = arg7.rightToRight;
            this.topToTop = arg7.topToTop;
            this.topToBottom = arg7.topToBottom;
            this.bottomToTop = arg7.bottomToTop;
            this.bottomToBottom = arg7.bottomToBottom;
            this.baselineToBaseline = arg7.baselineToBaseline;
            this.circleConstraint = arg7.circleConstraint;
            this.circleRadius = arg7.circleRadius;
            this.circleAngle = arg7.circleAngle;
            this.startToEnd = arg7.startToEnd;
            this.startToStart = arg7.startToStart;
            this.endToStart = arg7.endToStart;
            this.endToEnd = arg7.endToEnd;
            this.goneLeftMargin = arg7.goneLeftMargin;
            this.goneTopMargin = arg7.goneTopMargin;
            this.goneRightMargin = arg7.goneRightMargin;
            this.goneBottomMargin = arg7.goneBottomMargin;
            this.goneStartMargin = arg7.goneStartMargin;
            this.goneEndMargin = arg7.goneEndMargin;
            this.horizontalBias = arg7.horizontalBias;
            this.verticalBias = arg7.verticalBias;
            this.dimensionRatio = arg7.dimensionRatio;
            this.dimensionRatioValue = arg7.dimensionRatioValue;
            this.dimensionRatioSide = arg7.dimensionRatioSide;
            this.horizontalWeight = arg7.horizontalWeight;
            this.verticalWeight = arg7.verticalWeight;
            this.horizontalChainStyle = arg7.horizontalChainStyle;
            this.verticalChainStyle = arg7.verticalChainStyle;
            this.constrainedWidth = arg7.constrainedWidth;
            this.constrainedHeight = arg7.constrainedHeight;
            this.matchConstraintDefaultWidth = arg7.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = arg7.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = arg7.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = arg7.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = arg7.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = arg7.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = arg7.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = arg7.matchConstraintPercentHeight;
            this.editorAbsoluteX = arg7.editorAbsoluteX;
            this.editorAbsoluteY = arg7.editorAbsoluteY;
            this.orientation = arg7.orientation;
            this.horizontalDimensionFixed = arg7.horizontalDimensionFixed;
            this.verticalDimensionFixed = arg7.verticalDimensionFixed;
            this.needsBaseline = arg7.needsBaseline;
            this.isGuideline = arg7.isGuideline;
            this.resolvedLeftToLeft = arg7.resolvedLeftToLeft;
            this.resolvedLeftToRight = arg7.resolvedLeftToRight;
            this.resolvedRightToLeft = arg7.resolvedRightToLeft;
            this.resolvedRightToRight = arg7.resolvedRightToRight;
            this.resolveGoneLeftMargin = arg7.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = arg7.resolveGoneRightMargin;
            this.resolvedHorizontalBias = arg7.resolvedHorizontalBias;
            this.widget = arg7.widget;
        }

        public void reset() {
            if(this.widget != null) {
                this.widget.reset();
            }
        }

        @TargetApi(value=17) public void resolveLayoutDirection(int arg6) {
            int v0 = this.leftMargin;
            int v1 = this.rightMargin;
            super.resolveLayoutDirection(arg6);
            arg6 = -1;
            this.resolvedRightToLeft = arg6;
            this.resolvedRightToRight = arg6;
            this.resolvedLeftToLeft = arg6;
            this.resolvedLeftToRight = arg6;
            this.resolveGoneLeftMargin = arg6;
            this.resolveGoneRightMargin = arg6;
            this.resolveGoneLeftMargin = this.goneLeftMargin;
            this.resolveGoneRightMargin = this.goneRightMargin;
            this.resolvedHorizontalBias = this.horizontalBias;
            this.resolvedGuideBegin = this.guideBegin;
            this.resolvedGuideEnd = this.guideEnd;
            this.resolvedGuidePercent = this.guidePercent;
            int v3 = 0;
            int v2 = 1 == this.getLayoutDirection() ? 1 : 0;
            if(v2 != 0) {
                if(this.startToEnd != arg6) {
                    this.resolvedRightToLeft = this.startToEnd;
                    goto label_34;
                }
                else if(this.startToStart != arg6) {
                    this.resolvedRightToRight = this.startToStart;
                label_34:
                    v3 = 1;
                }

                if(this.endToStart != arg6) {
                    this.resolvedLeftToRight = this.endToStart;
                    v3 = 1;
                }

                if(this.endToEnd != arg6) {
                    this.resolvedLeftToLeft = this.endToEnd;
                    v3 = 1;
                }

                if(this.goneStartMargin != arg6) {
                    this.resolveGoneRightMargin = this.goneStartMargin;
                }

                if(this.goneEndMargin != arg6) {
                    this.resolveGoneLeftMargin = this.goneEndMargin;
                }

                float v2_1 = 1f;
                if(v3 != 0) {
                    this.resolvedHorizontalBias = v2_1 - this.horizontalBias;
                }

                if(!this.isGuideline) {
                    goto label_115;
                }

                if(this.orientation != 1) {
                    goto label_115;
                }

                float v4 = -1f;
                if(this.guidePercent != v4) {
                    this.resolvedGuidePercent = v2_1 - this.guidePercent;
                    this.resolvedGuideBegin = arg6;
                    this.resolvedGuideEnd = arg6;
                    goto label_115;
                }

                if(this.guideBegin != arg6) {
                    this.resolvedGuideEnd = this.guideBegin;
                    this.resolvedGuideBegin = arg6;
                    this.resolvedGuidePercent = v4;
                    goto label_115;
                }

                if(this.guideEnd == arg6) {
                    goto label_115;
                }

                this.resolvedGuideBegin = this.guideEnd;
                this.resolvedGuideEnd = arg6;
                this.resolvedGuidePercent = v4;
            }
            else {
                if(this.startToEnd != arg6) {
                    this.resolvedLeftToRight = this.startToEnd;
                }

                if(this.startToStart != arg6) {
                    this.resolvedLeftToLeft = this.startToStart;
                }

                if(this.endToStart != arg6) {
                    this.resolvedRightToLeft = this.endToStart;
                }

                if(this.endToEnd != arg6) {
                    this.resolvedRightToRight = this.endToEnd;
                }

                if(this.goneStartMargin != arg6) {
                    this.resolveGoneLeftMargin = this.goneStartMargin;
                }

                if(this.goneEndMargin == arg6) {
                    goto label_115;
                }

                this.resolveGoneRightMargin = this.goneEndMargin;
            }

        label_115:
            if(this.endToStart == arg6 && this.endToEnd == arg6 && this.startToStart == arg6 && this.startToEnd == arg6) {
                if(this.rightToLeft != arg6) {
                    this.resolvedRightToLeft = this.rightToLeft;
                    if(this.rightMargin <= 0 && v1 > 0) {
                        this.rightMargin = v1;
                    }
                }
                else if(this.rightToRight != arg6) {
                    this.resolvedRightToRight = this.rightToRight;
                    if(this.rightMargin <= 0 && v1 > 0) {
                        this.rightMargin = v1;
                    }
                }

                if(this.leftToLeft != arg6) {
                    this.resolvedLeftToLeft = this.leftToLeft;
                    if(this.leftMargin > 0) {
                        return;
                    }

                    if(v0 <= 0) {
                        return;
                    }

                    this.leftMargin = v0;
                    return;
                }

                if(this.leftToRight == arg6) {
                    return;
                }

                this.resolvedLeftToRight = this.leftToRight;
                if(this.leftMargin > 0) {
                    return;
                }

                if(v0 <= 0) {
                    return;
                }

                this.leftMargin = v0;
            }
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int v3 = -2;
            if(this.width == v3 && (this.constrainedWidth)) {
                this.horizontalDimensionFixed = false;
                this.matchConstraintDefaultWidth = 1;
            }

            if(this.height == v3 && (this.constrainedHeight)) {
                this.verticalDimensionFixed = false;
                this.matchConstraintDefaultHeight = 1;
            }

            int v4 = -1;
            if(this.width == 0 || this.width == v4) {
                this.horizontalDimensionFixed = false;
                if(this.width == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = v3;
                    this.constrainedWidth = true;
                }
            }

            if(this.height == 0 || this.height == v4) {
                this.verticalDimensionFixed = false;
                if(this.height == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = v3;
                    this.constrainedHeight = true;
                }
            }

            if(this.guidePercent != -1f || this.guideBegin != v4 || this.guideEnd != v4) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if(!(this.widget instanceof Guideline)) {
                    this.widget = new Guideline();
                }

                this.widget.setOrientation(this.orientation);
            }
        }
    }

    static final boolean ALLOWS_EMBEDDED = false;
    private static final boolean DEBUG = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-1.1.2";
    SparseArray mChildrenByIds;
    private ArrayList mConstraintHelpers;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private HashMap mDesignIds;
    private boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOptimizationLevel;
    private final ArrayList mVariableDimensionsWidgets;

    public ConstraintLayout(Context arg4) {
        super(arg4);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mVariableDimensionsWidgets = new ArrayList(100);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 3;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(null);
    }

    public ConstraintLayout(Context arg3, AttributeSet arg4) {
        super(arg3, arg4);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mVariableDimensionsWidgets = new ArrayList(100);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 3;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(arg4);
    }

    public ConstraintLayout(Context arg2, AttributeSet arg3, int arg4) {
        super(arg2, arg3, arg4);
        this.mChildrenByIds = new SparseArray();
        this.mConstraintHelpers = new ArrayList(4);
        this.mVariableDimensionsWidgets = new ArrayList(100);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = 0x7FFFFFFF;
        this.mMaxHeight = 0x7FFFFFFF;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 3;
        this.mConstraintSet = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.init(arg3);
    }

    public void addView(View arg1, int arg2, ViewGroup$LayoutParams arg3) {
        super.addView(arg1, arg2, arg3);
        if(Build$VERSION.SDK_INT < 14) {
            this.onViewAdded(arg1);
        }
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg1) {
        return arg1 instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas arg21) {
        super.dispatchDraw(arg21);
        if(this.isInEditMode()) {
            int v0 = this.getChildCount();
            float v1 = ((float)this.getWidth());
            float v2 = ((float)this.getHeight());
            float v3 = 1080f;
            float v4 = 1920f;
            int v6;
            for(v6 = 0; v6 < v0; ++v6) {
                View v8 = this.getChildAt(v6);
                if(v8.getVisibility() == 8) {
                }
                else {
                    Object v8_1 = v8.getTag();
                    if(v8_1 != null && ((v8_1 instanceof String))) {
                        String[] v8_2 = ((String)v8_1).split(",");
                        if(v8_2.length == 4) {
                            int v9 = Integer.parseInt(v8_2[0]);
                            int v10 = Integer.parseInt(v8_2[1]);
                            int v11 = Integer.parseInt(v8_2[2]);
                            v9 = ((int)((((float)v9)) / v3 * v1));
                            v10 = ((int)((((float)v10)) / v4 * v2));
                            int v8_3 = ((int)((((float)Integer.parseInt(v8_2[3]))) / v4 * v2));
                            Paint v15 = new Paint();
                            v15.setColor(0xFFFF0000);
                            float v14 = ((float)v9);
                            float v9_1 = ((float)(v9 + (((int)((((float)v11)) / v3 * v1)))));
                            float v11_1 = ((float)v10);
                            arg21.drawLine(v14, v11_1, v9_1, v11_1, v15);
                            float v8_4 = ((float)(v10 + v8_3));
                            arg21.drawLine(v9_1, v11_1, v9_1, v8_4, v15);
                            arg21.drawLine(v9_1, v8_4, v14, v8_4, v15);
                            arg21.drawLine(v14, v8_4, v14, v11_1, v15);
                            v15.setColor(0xFF00FF00);
                            arg21.drawLine(v14, v11_1, v9_1, v8_4, v15);
                            arg21.drawLine(v14, v8_4, v9_1, v11_1, v15);
                        }
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics arg2) {
        this.mMetrics = arg2;
        this.mLayoutWidget.fillMetrics(arg2);
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateLayoutParams(arg1);
    }

    public LayoutParams generateLayoutParams(AttributeSet arg3) {
        return new LayoutParams(this.getContext(), arg3);
    }

    protected ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
        return new LayoutParams(arg2);
    }

    public Object getDesignInformation(int arg1, Object arg2) {
        if(arg1 == 0 && ((arg2 instanceof String)) && this.mDesignIds != null && (this.mDesignIds.containsKey(arg2))) {
            return this.mDesignIds.get(arg2);
        }

        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.getOptimizationLevel();
    }

    private final ConstraintWidget getTargetWidget(int arg2) {
        if(arg2 == 0) {
            return this.mLayoutWidget;
        }

        Object v2 = this.mChildrenByIds.get(arg2);
        if((((ConstraintLayout)v2)) == this) {
            return this.mLayoutWidget;
        }

        ConstraintWidget v2_1 = v2 == null ? null : ((View)v2).getLayoutParams().widget;
        return v2_1;
    }

    public View getViewById(int arg2) {
        return this.mChildrenByIds.get(arg2);
    }

    public final ConstraintWidget getViewWidget(View arg1) {
        if((((ConstraintLayout)arg1)) == this) {
            return this.mLayoutWidget;
        }

        ConstraintWidget v1 = arg1 == null ? null : arg1.getLayoutParams().widget;
        return v1;
    }

    private void init(AttributeSet arg8) {
        this.mLayoutWidget.setCompanionWidget(this);
        this.mChildrenByIds.put(this.getId(), this);
        ConstraintSet v0 = null;
        this.mConstraintSet = v0;
        if(arg8 != null) {
            TypedArray v8 = this.getContext().obtainStyledAttributes(arg8, R$styleable.ConstraintLayout_Layout);
            int v1 = v8.getIndexCount();
            int v3;
            for(v3 = 0; v3 < v1; ++v3) {
                int v4 = v8.getIndex(v3);
                if(v4 == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = v8.getDimensionPixelOffset(v4, this.mMinWidth);
                    goto label_58;
                }

                if(v4 == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = v8.getDimensionPixelOffset(v4, this.mMinHeight);
                    goto label_58;
                }

                if(v4 == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = v8.getDimensionPixelOffset(v4, this.mMaxWidth);
                    goto label_58;
                }

                if(v4 == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = v8.getDimensionPixelOffset(v4, this.mMaxHeight);
                    goto label_58;
                }

                if(v4 == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = v8.getInt(v4, this.mOptimizationLevel);
                    goto label_58;
                }

                if(v4 == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    v4 = v8.getResourceId(v4, 0);
                    try {
                        this.mConstraintSet = new ConstraintSet();
                        this.mConstraintSet.load(this.getContext(), v4);
                    }
                    catch(Resources$NotFoundException ) {
                        this.mConstraintSet = v0;
                    }

                    this.mConstraintSetId = v4;
                }

            label_58:
            }

            v8.recycle();
        }

        this.mLayoutWidget.setOptimizationLevel(this.mOptimizationLevel);
    }

    private void internalMeasureChildren(int arg22, int arg23) {
        int v17;
        int v15;
        int v16;
        int v6;
        int v13;
        ConstraintLayout v0 = this;
        int v1 = arg22;
        int v2 = arg23;
        int v3 = this.getPaddingTop() + this.getPaddingBottom();
        int v4 = this.getPaddingLeft() + this.getPaddingRight();
        int v5 = this.getChildCount();
        int v7;
        for(v7 = 0; v7 < v5; ++v7) {
            View v8 = v0.getChildAt(v7);
            if(v8.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v9 = v8.getLayoutParams();
                ConstraintWidget v10 = ((LayoutParams)v9).widget;
                if(!((LayoutParams)v9).isGuideline) {
                    if(((LayoutParams)v9).isHelper) {
                    }
                    else {
                        v10.setVisibility(v8.getVisibility());
                        int v11 = ((LayoutParams)v9).width;
                        int v12 = ((LayoutParams)v9).height;
                        int v14 = -1;
                        if((((LayoutParams)v9).horizontalDimensionFixed) || (((LayoutParams)v9).verticalDimensionFixed)) {
                        label_49:
                            v13 = 1;
                        }
                        else {
                            if(!((LayoutParams)v9).horizontalDimensionFixed && ((LayoutParams)v9).matchConstraintDefaultWidth == 1) {
                                goto label_49;
                            }

                            if(((LayoutParams)v9).width == v14) {
                                goto label_49;
                            }

                            if(!((LayoutParams)v9).verticalDimensionFixed) {
                                if(((LayoutParams)v9).matchConstraintDefaultHeight == 1) {
                                    goto label_49;
                                }
                                else if(((LayoutParams)v9).height == v14) {
                                    goto label_49;
                                }
                            }

                            v13 = 0;
                        }

                        if(v13 != 0) {
                            v13 = -2;
                            if(v11 == 0) {
                                v6 = ConstraintLayout.getChildMeasureSpec(v1, v4, v13);
                                v16 = 1;
                            }
                            else if(v11 == v14) {
                                v6 = ConstraintLayout.getChildMeasureSpec(v1, v4, v14);
                                v16 = 0;
                            }
                            else {
                                v16 = v11 == v13 ? 1 : 0;
                                v6 = ConstraintLayout.getChildMeasureSpec(v1, v4, v11);
                            }

                            if(v12 == 0) {
                                v15 = ConstraintLayout.getChildMeasureSpec(v2, v3, v13);
                                v17 = 1;
                            }
                            else if(v12 == v14) {
                                v15 = ConstraintLayout.getChildMeasureSpec(v2, v3, v14);
                                v17 = 0;
                            }
                            else {
                                v17 = v12 == v13 ? 1 : 0;
                                v15 = ConstraintLayout.getChildMeasureSpec(v2, v3, v12);
                            }

                            v8.measure(v6, v15);
                            if(v0.mMetrics != null) {
                                ++v0.mMetrics.measures;
                            }

                            boolean v6_1 = v11 == v13 ? true : false;
                            v10.setWidthWrapContent(v6_1);
                            v6_1 = v12 == v13 ? true : false;
                            v10.setHeightWrapContent(v6_1);
                            v11 = v8.getMeasuredWidth();
                            v12 = v8.getMeasuredHeight();
                        }
                        else {
                            v16 = 0;
                            v17 = 0;
                        }

                        v10.setWidth(v11);
                        v10.setHeight(v12);
                        if(v16 != 0) {
                            v10.setWrapWidth(v11);
                        }

                        if(v17 != 0) {
                            v10.setWrapHeight(v12);
                        }

                        if(!((LayoutParams)v9).needsBaseline) {
                            goto label_119;
                        }

                        v6 = v8.getBaseline();
                        if(v6 == -1) {
                            goto label_119;
                        }

                        v10.setBaselineDistance(v6);
                    }
                }
            }

        label_119:
        }
    }

    private void internalMeasureDimensions(int arg25, int arg26) {
        int v14_2;
        long v19;
        int v21;
        int v22;
        int v9;
        int v18;
        int v11;
        int v13;
        int v6;
        int v12;
        int v10;
        long v8;
        ConstraintLayout v0 = this;
        int v1 = arg25;
        int v2 = arg26;
        int v3 = this.getPaddingTop() + this.getPaddingBottom();
        int v4 = this.getPaddingLeft() + this.getPaddingRight();
        int v5 = this.getChildCount();
        int v7 = 0;
        while(true) {
            v8 = 1;
            v10 = 8;
            v12 = -2;
            if(v7 >= v5) {
                break;
            }

            View v14 = v0.getChildAt(v7);
            if(v14.getVisibility() != v10) {
                ViewGroup$LayoutParams v10_1 = v14.getLayoutParams();
                ConstraintWidget v15 = ((LayoutParams)v10_1).widget;
                if(((LayoutParams)v10_1).isGuideline) {
                    goto label_18;
                }
                else if(((LayoutParams)v10_1).isHelper) {
                    goto label_18;
                }
                else {
                    v15.setVisibility(v14.getVisibility());
                    v6 = ((LayoutParams)v10_1).width;
                    v13 = ((LayoutParams)v10_1).height;
                    if(v6 != 0) {
                        if(v13 == 0) {
                        }
                        else {
                            int v16 = v6 == v12 ? 1 : 0;
                            v11 = ConstraintLayout.getChildMeasureSpec(v1, v4, v6);
                            int v17 = v13 == v12 ? 1 : 0;
                            v14.measure(v11, ConstraintLayout.getChildMeasureSpec(v2, v3, v13));
                            if(v0.mMetrics != null) {
                                v18 = v3;
                                v0.mMetrics.measures += v8;
                            }
                            else {
                                v18 = v3;
                            }

                            v2 = -2;
                            boolean v3_1 = v6 == v2 ? true : false;
                            v15.setWidthWrapContent(v3_1);
                            boolean v2_1 = v13 == v2 ? true : false;
                            v15.setHeightWrapContent(v2_1);
                            v2 = v14.getMeasuredWidth();
                            v3 = v14.getMeasuredHeight();
                            v15.setWidth(v2);
                            v15.setHeight(v3);
                            if(v16 != 0) {
                                v15.setWrapWidth(v2);
                            }

                            if(v17 != 0) {
                                v15.setWrapHeight(v3);
                            }

                            if(((LayoutParams)v10_1).needsBaseline) {
                                v6 = v14.getBaseline();
                                if(v6 != -1) {
                                    v15.setBaselineDistance(v6);
                                }
                            }

                            if(!((LayoutParams)v10_1).horizontalDimensionFixed) {
                                goto label_93;
                            }

                            if(!((LayoutParams)v10_1).verticalDimensionFixed) {
                                goto label_93;
                            }

                            v15.getResolutionWidth().resolve(v2);
                            v15.getResolutionHeight().resolve(v3);
                            goto label_93;
                        }
                    }

                    v18 = v3;
                    v15.getResolutionWidth().invalidate();
                    v15.getResolutionHeight().invalidate();
                }
            }
            else {
            label_18:
                v18 = v3;
            }

        label_93:
            ++v7;
            v3 = v18;
            v2 = arg26;
        }

        v18 = v3;
        v0.mLayoutWidget.solveGraph();
        v2 = 0;
        while(v2 < v5) {
            View v3_2 = v0.getChildAt(v2);
            if(v3_2.getVisibility() != v10) {
                ViewGroup$LayoutParams v6_1 = v3_2.getLayoutParams();
                ConstraintWidget v7_1 = ((LayoutParams)v6_1).widget;
                if(((LayoutParams)v6_1).isGuideline) {
                    goto label_105;
                }
                else if(((LayoutParams)v6_1).isHelper) {
                    goto label_105;
                }
                else {
                    v7_1.setVisibility(v3_2.getVisibility());
                    v11 = ((LayoutParams)v6_1).width;
                    v12 = ((LayoutParams)v6_1).height;
                    if(v11 != 0 && v12 != 0) {
                        goto label_105;
                    }

                    ResolutionAnchor v13_1 = v7_1.getAnchor(Type.LEFT).getResolutionNode();
                    ResolutionAnchor v14_1 = v7_1.getAnchor(Type.RIGHT).getResolutionNode();
                    int v15_1 = v7_1.getAnchor(Type.LEFT).getTarget() == null || v7_1.getAnchor(Type.RIGHT).getTarget() == null ? 0 : 1;
                    ResolutionAnchor v10_2 = v7_1.getAnchor(Type.TOP).getResolutionNode();
                    ResolutionAnchor v8_1 = v7_1.getAnchor(Type.BOTTOM).getResolutionNode();
                    v9 = v7_1.getAnchor(Type.TOP).getTarget() == null || v7_1.getAnchor(Type.BOTTOM).getTarget() == null ? 0 : 1;
                    if(v11 == 0 && v12 == 0 && v15_1 != 0 && v9 != 0) {
                        v22 = v2;
                        v21 = v5;
                        v9 = v18;
                        v19 = 1;
                        goto label_325;
                    }

                    v21 = v5;
                    v22 = v2;
                    v2 = v0.mLayoutWidget.getHorizontalDimensionBehaviour() != DimensionBehaviour.WRAP_CONTENT ? 1 : 0;
                    ViewGroup$LayoutParams v23 = v6_1;
                    v6 = v0.mLayoutWidget.getVerticalDimensionBehaviour() != DimensionBehaviour.WRAP_CONTENT ? 1 : 0;
                    if(v2 == 0) {
                        v7_1.getResolutionWidth().invalidate();
                    }

                    if(v6 == 0) {
                        v7_1.getResolutionHeight().invalidate();
                    }

                    if(v11 == 0) {
                        if(v2 != 0 && (v7_1.isSpreadWidth()) && v15_1 != 0 && (v13_1.isResolved()) && (v14_1.isResolved())) {
                            v11 = ((int)(v14_1.getResolvedValue() - v13_1.getResolvedValue()));
                            v7_1.getResolutionWidth().resolve(v11);
                            v13 = ConstraintLayout.getChildMeasureSpec(v1, v4, v11);
                            goto label_225;
                        }

                        v13 = ConstraintLayout.getChildMeasureSpec(v1, v4, -2);
                        v2 = 0;
                        v5 = 1;
                    }
                    else {
                        v5 = -2;
                        v13 = -1;
                        if(v11 == v13) {
                            v13 = ConstraintLayout.getChildMeasureSpec(v1, v4, v13);
                        label_225:
                            v5 = 0;
                            goto label_232;
                        }

                        v5 = v11 == v5 ? 1 : 0;
                        v13 = ConstraintLayout.getChildMeasureSpec(v1, v4, v11);
                    }

                label_232:
                    if(v12 == 0) {
                        if(v6 != 0 && (v7_1.isSpreadHeight()) && v9 != 0 && (v10_2.isResolved()) && (v8_1.isResolved())) {
                            v12 = ((int)(v8_1.getResolvedValue() - v10_2.getResolvedValue()));
                            v7_1.getResolutionHeight().resolve(v12);
                            v9 = v18;
                            v14_2 = ConstraintLayout.getChildMeasureSpec(arg26, v9, v12);
                            goto label_267;
                        }

                        v9 = v18;
                        v14_2 = ConstraintLayout.getChildMeasureSpec(arg26, v9, -2);
                        v6 = 0;
                        v10 = 1;
                    }
                    else {
                        v9 = v18;
                        int v8_2 = arg26;
                        v10 = -2;
                        v14_2 = -1;
                        if(v12 == v14_2) {
                            v14_2 = ConstraintLayout.getChildMeasureSpec(v8_2, v9, v14_2);
                        label_267:
                            v10 = 0;
                            goto label_274;
                        }

                        v10 = v12 == v10 ? 1 : 0;
                        v14_2 = ConstraintLayout.getChildMeasureSpec(v8_2, v9, v12);
                    }

                label_274:
                    v3_2.measure(v13, v14_2);
                    if(v0.mMetrics != null) {
                        v19 = 1;
                        v0.mMetrics.measures += v19;
                    }
                    else {
                        v19 = 1;
                    }

                    v13 = -2;
                    boolean v11_1 = v11 == v13 ? true : false;
                    v7_1.setWidthWrapContent(v11_1);
                    v11_1 = v12 == v13 ? true : false;
                    v7_1.setHeightWrapContent(v11_1);
                    v11 = v3_2.getMeasuredWidth();
                    v12 = v3_2.getMeasuredHeight();
                    v7_1.setWidth(v11);
                    v7_1.setHeight(v12);
                    if(v5 != 0) {
                        v7_1.setWrapWidth(v11);
                    }

                    if(v10 != 0) {
                        v7_1.setWrapHeight(v12);
                    }

                    if(v2 != 0) {
                        v7_1.getResolutionWidth().resolve(v11);
                    }
                    else {
                        v7_1.getResolutionWidth().remove();
                    }

                    if(v6 != 0) {
                        v7_1.getResolutionHeight().resolve(v12);
                    }
                    else {
                        v7_1.getResolutionHeight().remove();
                    }

                    v6_1 = v23;
                    if(!((LayoutParams)v6_1).needsBaseline) {
                        goto label_325;
                    }

                    v2 = v3_2.getBaseline();
                    if(v2 == -1) {
                        goto label_325;
                    }

                    v7_1.setBaselineDistance(v2);
                }
            }
            else {
            label_105:
                v22 = v2;
                v21 = v5;
                v19 = v8;
                v9 = v18;
            }

        label_325:
            v2 = v22 + 1;
            v18 = v9;
            v8 = v19;
            v5 = v21;
            v10 = 8;
        }
    }

    protected void onLayout(boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        int v6 = this.getChildCount();
        boolean v7 = this.isInEditMode();
        arg8 = 0;
        for(arg9 = 0; arg9 < v6; ++arg9) {
            View v10 = this.getChildAt(arg9);
            ViewGroup$LayoutParams v0 = v10.getLayoutParams();
            ConstraintWidget v1 = ((LayoutParams)v0).widget;
            if(v10.getVisibility() == 8 && !((LayoutParams)v0).isGuideline && !((LayoutParams)v0).isHelper && !v7) {
            }
            else if(((LayoutParams)v0).isInPlaceholder) {
            }
            else {
                int v0_1 = v1.getDrawX();
                int v2 = v1.getDrawY();
                int v3 = v1.getWidth() + v0_1;
                int v1_1 = v1.getHeight() + v2;
                v10.layout(v0_1, v2, v3, v1_1);
                if((v10 instanceof Placeholder)) {
                    v10 = ((Placeholder)v10).getContent();
                    if(v10 != null) {
                        v10.setVisibility(0);
                        v10.layout(v0_1, v2, v3, v1_1);
                    }
                }
            }
        }

        v6 = this.mConstraintHelpers.size();
        if(v6 > 0) {
            while(arg8 < v6) {
                this.mConstraintHelpers.get(arg8).updatePostLayout(this);
                ++arg8;
            }
        }
    }

    protected void onMeasure(int arg26, int arg27) {
        // Method was not decompiled
    }

    public void onViewAdded(View arg4) {
        if(Build$VERSION.SDK_INT >= 14) {
            super.onViewAdded(arg4);
        }

        ConstraintWidget v0 = this.getViewWidget(arg4);
        if(((arg4 instanceof androidx.constraintlayout.widget.Guideline)) && !(v0 instanceof Guideline)) {
            ViewGroup$LayoutParams v0_1 = arg4.getLayoutParams();
            ((LayoutParams)v0_1).widget = new Guideline();
            ((LayoutParams)v0_1).isGuideline = true;
            ((LayoutParams)v0_1).widget.setOrientation(((LayoutParams)v0_1).orientation);
        }

        if((arg4 instanceof ConstraintHelper)) {
            View v0_2 = arg4;
            ((ConstraintHelper)v0_2).validateParams();
            arg4.getLayoutParams().isHelper = true;
            if(!this.mConstraintHelpers.contains(v0_2)) {
                this.mConstraintHelpers.add(v0_2);
            }
        }

        this.mChildrenByIds.put(arg4.getId(), arg4);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View arg3) {
        if(Build$VERSION.SDK_INT >= 14) {
            super.onViewRemoved(arg3);
        }

        this.mChildrenByIds.remove(arg3.getId());
        ConstraintWidget v0 = this.getViewWidget(arg3);
        this.mLayoutWidget.remove(v0);
        this.mConstraintHelpers.remove(arg3);
        this.mVariableDimensionsWidgets.remove(v0);
        this.mDirtyHierarchy = true;
    }

    public void removeView(View arg3) {
        super.removeView(arg3);
        if(Build$VERSION.SDK_INT < 14) {
            this.onViewRemoved(arg3);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        float v17;
        ConstraintWidget v9_2;
        int v16;
        int v3_1;
        ConstraintWidget v6_1;
        int v8;
        String v7;
        View v6;
        int v5;
        ConstraintLayout v0 = this;
        boolean v1 = this.isInEditMode();
        int v2 = this.getChildCount();
        boolean v3 = false;
        int v4 = -1;
        if(v1) {
            v5 = 0;
            while(v5 < v2) {
                v6 = v0.getChildAt(v5);
                try {
                    v7 = this.getResources().getResourceName(v6.getId());
                    v0.setDesignInformation(0, v7, Integer.valueOf(v6.getId()));
                    v8 = v7.indexOf(0x2F);
                    if(v8 != v4) {
                        v7 = v7.substring(v8 + 1);
                    }

                    v0.getTargetWidget(v6.getId()).setDebugName(v7);
                    goto label_23;
                }
                catch(Resources$NotFoundException ) {
                label_23:
                    ++v5;
                    continue;
                }

                break;
            }
        }

        for(v5 = 0; v5 < v2; ++v5) {
            v6_1 = v0.getViewWidget(v0.getChildAt(v5));
            if(v6_1 == null) {
            }
            else {
                v6_1.reset();
            }
        }

        if(v0.mConstraintSetId != v4) {
            for(v5 = 0; v5 < v2; ++v5) {
                v6 = v0.getChildAt(v5);
                if(v6.getId() == v0.mConstraintSetId && ((v6 instanceof Constraints))) {
                    v0.mConstraintSet = ((Constraints)v6).getConstraintSet();
                }
            }
        }

        if(v0.mConstraintSet != null) {
            v0.mConstraintSet.applyToInternal(v0);
        }

        v0.mLayoutWidget.removeAllChildren();
        v5 = v0.mConstraintHelpers.size();
        if(v5 > 0) {
            int v6_2;
            for(v6_2 = 0; v6_2 < v5; ++v6_2) {
                v0.mConstraintHelpers.get(v6_2).updatePreLayout(v0);
            }
        }

        for(v5 = 0; v5 < v2; ++v5) {
            v6 = v0.getChildAt(v5);
            if((v6 instanceof Placeholder)) {
                ((Placeholder)v6).updatePreLayout(v0);
            }
        }

        for(v5 = 0; v5 < v2; ++v5) {
            v6 = v0.getChildAt(v5);
            ConstraintWidget v13 = v0.getViewWidget(v6);
            if(v13 == null) {
            }
            else {
                ViewGroup$LayoutParams v14 = v6.getLayoutParams();
                ((LayoutParams)v14).validate();
                if(((LayoutParams)v14).helped) {
                    ((LayoutParams)v14).helped = v3;
                }
                else if(v1) {
                    try {
                        v7 = this.getResources().getResourceName(v6.getId());
                        v0.setDesignInformation(((int)v3), v7, Integer.valueOf(v6.getId()));
                        v0.getTargetWidget(v6.getId()).setDebugName(v7.substring(v7.indexOf("id/") + 3));
                        goto label_100;
                    }
                    catch(Resources$NotFoundException ) {
                    label_100:
                        v13.setVisibility(v6.getVisibility());
                        if(((LayoutParams)v14).isInPlaceholder) {
                            v13.setVisibility(8);
                        }

                        v13.setCompanionWidget(v6);
                        v0.mLayoutWidget.add(v13);
                        if(!((LayoutParams)v14).verticalDimensionFixed || !((LayoutParams)v14).horizontalDimensionFixed) {
                            v0.mVariableDimensionsWidgets.add(v13);
                        }

                        int v7_1 = 17;
                        if(((LayoutParams)v14).isGuideline) {
                            v6_2 = ((LayoutParams)v14).resolvedGuideBegin;
                            v8 = ((LayoutParams)v14).resolvedGuideEnd;
                            float v9 = ((LayoutParams)v14).resolvedGuidePercent;
                            if(Build$VERSION.SDK_INT < v7_1) {
                                v6_2 = ((LayoutParams)v14).guideBegin;
                                v8 = ((LayoutParams)v14).guideEnd;
                                v9 = ((LayoutParams)v14).guidePercent;
                            }

                            if(v9 != -1f) {
                                ((Guideline)v13).setGuidePercent(v9);
                                goto label_443;
                            }

                            if(v6_2 != v4) {
                                ((Guideline)v13).setGuideBegin(v6_2);
                                goto label_443;
                            }

                            if(v8 == v4) {
                                goto label_443;
                            }

                            ((Guideline)v13).setGuideEnd(v8);
                            goto label_443;
                        }

                        if(((LayoutParams)v14).leftToLeft == v4 && ((LayoutParams)v14).leftToRight == v4 && ((LayoutParams)v14).rightToLeft == v4 && ((LayoutParams)v14).rightToRight == v4 && ((LayoutParams)v14).startToStart == v4 && ((LayoutParams)v14).startToEnd == v4 && ((LayoutParams)v14).endToStart == v4 && ((LayoutParams)v14).endToEnd == v4 && ((LayoutParams)v14).topToTop == v4 && ((LayoutParams)v14).topToBottom == v4 && ((LayoutParams)v14).bottomToTop == v4 && ((LayoutParams)v14).bottomToBottom == v4 && ((LayoutParams)v14).baselineToBaseline == v4 && ((LayoutParams)v14).editorAbsoluteX == v4 && ((LayoutParams)v14).editorAbsoluteY == v4 && ((LayoutParams)v14).circleConstraint == v4 && ((LayoutParams)v14).width != v4 && ((LayoutParams)v14).height != v4) {
                            goto label_443;
                        }

                        v6_2 = ((LayoutParams)v14).resolvedLeftToLeft;
                        v8 = ((LayoutParams)v14).resolvedLeftToRight;
                        int v9_1 = ((LayoutParams)v14).resolvedRightToLeft;
                        int v10 = ((LayoutParams)v14).resolvedRightToRight;
                        int v11 = ((LayoutParams)v14).resolveGoneLeftMargin;
                        int v12 = ((LayoutParams)v14).resolveGoneRightMargin;
                        float v15 = ((LayoutParams)v14).resolvedHorizontalBias;
                        if(Build$VERSION.SDK_INT < v7_1) {
                            v3_1 = ((LayoutParams)v14).leftToLeft;
                            v6_2 = ((LayoutParams)v14).leftToRight;
                            v9_1 = ((LayoutParams)v14).rightToLeft;
                            v10 = ((LayoutParams)v14).rightToRight;
                            v7_1 = ((LayoutParams)v14).goneLeftMargin;
                            v8 = ((LayoutParams)v14).goneRightMargin;
                            v15 = ((LayoutParams)v14).horizontalBias;
                            if(v3_1 == v4 && v6_2 == v4) {
                                if(((LayoutParams)v14).startToStart != v4) {
                                    v3_1 = ((LayoutParams)v14).startToStart;
                                }
                                else if(((LayoutParams)v14).startToEnd != v4) {
                                    v6_2 = ((LayoutParams)v14).startToEnd;
                                }
                            }

                            int v25 = v6_2;
                            v6_2 = v3_1;
                            v3_1 = v25;
                            if(v9_1 == v4 && v10 == v4) {
                                if(((LayoutParams)v14).endToStart != v4) {
                                    v9_1 = ((LayoutParams)v14).endToStart;
                                }
                                else if(((LayoutParams)v14).endToEnd != v4) {
                                    v10 = ((LayoutParams)v14).endToEnd;
                                }
                            }

                            v12 = v7_1;
                            v16 = v8;
                        }
                        else {
                            v3_1 = v8;
                            v16 = v12;
                            v12 = v11;
                        }

                        v11 = v10;
                        float v10_1 = v15;
                        int v15_1 = v9_1;
                        if(((LayoutParams)v14).circleConstraint != v4) {
                            ConstraintWidget v3_2 = v0.getTargetWidget(((LayoutParams)v14).circleConstraint);
                            if(v3_2 != null) {
                                v13.connectCircularConstraint(v3_2, ((LayoutParams)v14).circleAngle, ((LayoutParams)v14).circleRadius);
                            }
                        }
                        else {
                            if(v6_2 != v4) {
                                v9_2 = v0.getTargetWidget(v6_2);
                                if(v9_2 != null) {
                                    v17 = v10_1;
                                    v3_1 = v11;
                                    v13.immediateConnect(Type.LEFT, v9_2, Type.LEFT, ((LayoutParams)v14).leftMargin, v12);
                                }
                                else {
                                    v17 = v10_1;
                                    v3_1 = v11;
                                }

                                v6_2 = v3_1;
                            }
                            else {
                                v17 = v10_1;
                                v6_2 = v11;
                                if(v3_1 == v4) {
                                    goto label_254;
                                }

                                v9_2 = v0.getTargetWidget(v3_1);
                                if(v9_2 == null) {
                                    goto label_254;
                                }

                                v13.immediateConnect(Type.LEFT, v9_2, Type.RIGHT, ((LayoutParams)v14).leftMargin, v12);
                            }

                        label_254:
                            if(v15_1 != v4) {
                                v9_2 = v0.getTargetWidget(v15_1);
                                if(v9_2 != null) {
                                    v13.immediateConnect(Type.RIGHT, v9_2, Type.LEFT, ((LayoutParams)v14).rightMargin, v16);
                                }
                            }
                            else if(v6_2 != v4) {
                                v9_2 = v0.getTargetWidget(v6_2);
                                if(v9_2 != null) {
                                    v13.immediateConnect(Type.RIGHT, v9_2, Type.RIGHT, ((LayoutParams)v14).rightMargin, v16);
                                }
                            }

                            if(((LayoutParams)v14).topToTop != v4) {
                                v9_2 = v0.getTargetWidget(((LayoutParams)v14).topToTop);
                                if(v9_2 != null) {
                                    v13.immediateConnect(Type.TOP, v9_2, Type.TOP, ((LayoutParams)v14).topMargin, ((LayoutParams)v14).goneTopMargin);
                                }
                            }
                            else if(((LayoutParams)v14).topToBottom != v4) {
                                v9_2 = v0.getTargetWidget(((LayoutParams)v14).topToBottom);
                                if(v9_2 != null) {
                                    v13.immediateConnect(Type.TOP, v9_2, Type.BOTTOM, ((LayoutParams)v14).topMargin, ((LayoutParams)v14).goneTopMargin);
                                }
                            }

                            if(((LayoutParams)v14).bottomToTop != v4) {
                                v9_2 = v0.getTargetWidget(((LayoutParams)v14).bottomToTop);
                                if(v9_2 != null) {
                                    v13.immediateConnect(Type.BOTTOM, v9_2, Type.TOP, ((LayoutParams)v14).bottomMargin, ((LayoutParams)v14).goneBottomMargin);
                                }
                            }
                            else if(((LayoutParams)v14).bottomToBottom != v4) {
                                v9_2 = v0.getTargetWidget(((LayoutParams)v14).bottomToBottom);
                                if(v9_2 != null) {
                                    v13.immediateConnect(Type.BOTTOM, v9_2, Type.BOTTOM, ((LayoutParams)v14).bottomMargin, ((LayoutParams)v14).goneBottomMargin);
                                }
                            }

                            if(((LayoutParams)v14).baselineToBaseline != v4) {
                                Object v3_3 = v0.mChildrenByIds.get(((LayoutParams)v14).baselineToBaseline);
                                v6_1 = v0.getTargetWidget(((LayoutParams)v14).baselineToBaseline);
                                if(v6_1 != null && v3_3 != null && ((((View)v3_3).getLayoutParams() instanceof LayoutParams))) {
                                    ViewGroup$LayoutParams v3_4 = ((View)v3_3).getLayoutParams();
                                    ((LayoutParams)v14).needsBaseline = true;
                                    ((LayoutParams)v3_4).needsBaseline = true;
                                    v13.getAnchor(Type.BASELINE).connect(v6_1.getAnchor(Type.BASELINE), 0, -1, Strength.STRONG, 0, true);
                                    v13.getAnchor(Type.TOP).reset();
                                    v13.getAnchor(Type.BOTTOM).reset();
                                }
                            }

                            float v3_5 = 0.5f;
                            v15 = v17;
                            if(v15 >= 0f && v15 != v3_5) {
                                v13.setHorizontalBiasPercent(v15);
                            }

                            if(((LayoutParams)v14).verticalBias < 0f) {
                                goto label_363;
                            }

                            if(((LayoutParams)v14).verticalBias == v3_5) {
                                goto label_363;
                            }

                            v13.setVerticalBiasPercent(((LayoutParams)v14).verticalBias);
                        }

                    label_363:
                        if((v1) && (((LayoutParams)v14).editorAbsoluteX != v4 || ((LayoutParams)v14).editorAbsoluteY != v4)) {
                            v13.setOrigin(((LayoutParams)v14).editorAbsoluteX, ((LayoutParams)v14).editorAbsoluteY);
                        }

                        if(((LayoutParams)v14).horizontalDimensionFixed) {
                            v13.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                            v13.setWidth(((LayoutParams)v14).width);
                        }
                        else if(((LayoutParams)v14).width == v4) {
                            v13.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                            v13.getAnchor(Type.LEFT).mMargin = ((LayoutParams)v14).leftMargin;
                            v13.getAnchor(Type.RIGHT).mMargin = ((LayoutParams)v14).rightMargin;
                        }
                        else {
                            v13.setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                            v13.setWidth(0);
                        }

                        if(((LayoutParams)v14).verticalDimensionFixed) {
                            v3 = false;
                            v13.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                            v13.setHeight(((LayoutParams)v14).height);
                        }
                        else if(((LayoutParams)v14).height == v4) {
                            v13.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_PARENT);
                            v13.getAnchor(Type.TOP).mMargin = ((LayoutParams)v14).topMargin;
                            v13.getAnchor(Type.BOTTOM).mMargin = ((LayoutParams)v14).bottomMargin;
                            v3 = false;
                        }
                        else {
                            v13.setVerticalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                            v3 = false;
                            v13.setHeight(0);
                        }

                        if(((LayoutParams)v14).dimensionRatio != null) {
                            v13.setDimensionRatio(((LayoutParams)v14).dimensionRatio);
                        }

                        v13.setHorizontalWeight(((LayoutParams)v14).horizontalWeight);
                        v13.setVerticalWeight(((LayoutParams)v14).verticalWeight);
                        v13.setHorizontalChainStyle(((LayoutParams)v14).horizontalChainStyle);
                        v13.setVerticalChainStyle(((LayoutParams)v14).verticalChainStyle);
                        v13.setHorizontalMatchStyle(((LayoutParams)v14).matchConstraintDefaultWidth, ((LayoutParams)v14).matchConstraintMinWidth, ((LayoutParams)v14).matchConstraintMaxWidth, ((LayoutParams)v14).matchConstraintPercentWidth);
                        v13.setVerticalMatchStyle(((LayoutParams)v14).matchConstraintDefaultHeight, ((LayoutParams)v14).matchConstraintMinHeight, ((LayoutParams)v14).matchConstraintMaxHeight, ((LayoutParams)v14).matchConstraintPercentHeight);
                        goto label_443;
                    }
                }

                goto label_100;
            }

        label_443:
        }
    }

    public void setConstraintSet(ConstraintSet arg1) {
        this.mConstraintSet = arg1;
    }

    public void setDesignInformation(int arg2, Object arg3, Object arg4) {
        String v3;
        if(arg2 == 0 && ((arg3 instanceof String)) && ((arg4 instanceof Integer))) {
            if(this.mDesignIds == null) {
                this.mDesignIds = new HashMap();
            }

            arg2 = ((String)arg3).indexOf("/");
            if(arg2 != -1) {
                v3 = ((String)arg3).substring(arg2 + 1);
            }

            this.mDesignIds.put(v3, Integer.valueOf(((Integer)arg4).intValue()));
        }
    }

    public void setId(int arg3) {
        this.mChildrenByIds.remove(this.getId());
        super.setId(arg3);
        this.mChildrenByIds.put(this.getId(), this);
    }

    public void setMaxHeight(int arg2) {
        if(arg2 == this.mMaxHeight) {
            return;
        }

        this.mMaxHeight = arg2;
        this.requestLayout();
    }

    public void setMaxWidth(int arg2) {
        if(arg2 == this.mMaxWidth) {
            return;
        }

        this.mMaxWidth = arg2;
        this.requestLayout();
    }

    public void setMinHeight(int arg2) {
        if(arg2 == this.mMinHeight) {
            return;
        }

        this.mMinHeight = arg2;
        this.requestLayout();
    }

    public void setMinWidth(int arg2) {
        if(arg2 == this.mMinWidth) {
            return;
        }

        this.mMinWidth = arg2;
        this.requestLayout();
    }

    public void setOptimizationLevel(int arg2) {
        this.mLayoutWidget.setOptimizationLevel(arg2);
    }

    private void setSelfDimensionBehaviour(int arg10, int arg11) {
        int v0 = View$MeasureSpec.getMode(arg10);
        arg10 = View$MeasureSpec.getSize(arg10);
        int v1 = View$MeasureSpec.getMode(arg11);
        arg11 = View$MeasureSpec.getSize(arg11);
        int v2 = this.getPaddingTop() + this.getPaddingBottom();
        int v3 = this.getPaddingLeft() + this.getPaddingRight();
        DimensionBehaviour v4 = DimensionBehaviour.FIXED;
        DimensionBehaviour v5 = DimensionBehaviour.FIXED;
        this.getLayoutParams();
        int v6 = 0x40000000;
        int v7 = 0x80000000;
        if(v0 != v7) {
            if(v0 == 0) {
                v4 = DimensionBehaviour.WRAP_CONTENT;
            }
            else if(v0 == v6) {
                arg10 = Math.min(this.mMaxWidth, arg10) - v3;
                goto label_28;
            }

            arg10 = 0;
        }
        else {
            v4 = DimensionBehaviour.WRAP_CONTENT;
        }

    label_28:
        if(v1 != v7) {
            if(v1 == 0) {
                v5 = DimensionBehaviour.WRAP_CONTENT;
            }
            else if(v1 == v6) {
                arg11 = Math.min(this.mMaxHeight, arg11) - v2;
                goto label_40;
            }

            arg11 = 0;
        }
        else {
            v5 = DimensionBehaviour.WRAP_CONTENT;
        }

    label_40:
        this.mLayoutWidget.setMinWidth(0);
        this.mLayoutWidget.setMinHeight(0);
        this.mLayoutWidget.setHorizontalDimensionBehaviour(v4);
        this.mLayoutWidget.setWidth(arg10);
        this.mLayoutWidget.setVerticalDimensionBehaviour(v5);
        this.mLayoutWidget.setHeight(arg11);
        this.mLayoutWidget.setMinWidth(this.mMinWidth - this.getPaddingLeft() - this.getPaddingRight());
        this.mLayoutWidget.setMinHeight(this.mMinHeight - this.getPaddingTop() - this.getPaddingBottom());
    }

    public boolean shouldDelayChildPressedState() {
        return 0;
    }

    protected void solveLinearSystem(String arg5) {
        this.mLayoutWidget.layout();
        if(this.mMetrics != null) {
            ++this.mMetrics.resolutions;
        }
    }

    private void updateHierarchy() {
        int v0 = this.getChildCount();
        int v1 = 0;
        int v2 = 0;
        while(v2 < v0) {
            if(this.getChildAt(v2).isLayoutRequested()) {
                v1 = 1;
            }
            else {
                ++v2;
                continue;
            }

            break;
        }

        if(v1 != 0) {
            this.mVariableDimensionsWidgets.clear();
            this.setChildrenConstraints();
        }
    }

    private void updatePostMeasures() {
        int v0 = this.getChildCount();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            View v3 = this.getChildAt(v2);
            if((v3 instanceof Placeholder)) {
                ((Placeholder)v3).updatePostMeasure(this);
            }
        }

        v0 = this.mConstraintHelpers.size();
        if(v0 > 0) {
            while(v1 < v0) {
                this.mConstraintHelpers.get(v1).updatePostMeasure(this);
                ++v1;
            }
        }
    }
}

