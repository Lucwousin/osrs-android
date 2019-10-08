package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;

public class Optimizer {
    static final int FLAG_CHAIN_DANGLING = 1;
    static final int FLAG_RECOMPUTE_BOUNDS = 2;
    static final int FLAG_USE_OPTIMIZE = 0;
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 3;
    static boolean[] flags;

    static {
        Optimizer.flags = new boolean[3];
    }

    public Optimizer() {
        super();
    }

    static void analyze(int arg17, ConstraintWidget arg18) {
        ConstraintWidget v0 = arg18;
        arg18.updateResolutionNodes();
        ResolutionAnchor v1 = v0.mLeft.getResolutionNode();
        ResolutionAnchor v2 = v0.mTop.getResolutionNode();
        ResolutionAnchor v3 = v0.mRight.getResolutionNode();
        ResolutionAnchor v4 = v0.mBottom.getResolutionNode();
        int v5 = 8;
        int v6 = (arg17 & 8) == v5 ? 1 : 0;
        int v9 = v0.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT || !Optimizer.optimizableMatchConstraint(v0, 0) ? 0 : 1;
        int v11 = 3;
        int v12 = 4;
        int v14 = -1;
        int v15 = 2;
        if(v1.type != v12 && v3.type != v12) {
            if(v0.mListDimensionBehaviors[0] != DimensionBehaviour.FIXED && (v9 == 0 || arg18.getVisibility() != v5)) {
                if(v9 == 0) {
                    goto label_186;
                }

                int v7 = arg18.getWidth();
                v1.setType(1);
                v3.setType(1);
                if(v0.mLeft.mTarget == null && v0.mRight.mTarget == null) {
                    if(v6 != 0) {
                        v3.dependsOn(v1, 1, arg18.getResolutionWidth());
                    }
                    else {
                        v3.dependsOn(v1, v7);
                    }

                    goto label_186;
                }

                if(v0.mLeft.mTarget != null && v0.mRight.mTarget == null) {
                    if(v6 != 0) {
                        v3.dependsOn(v1, 1, arg18.getResolutionWidth());
                    }
                    else {
                        v3.dependsOn(v1, v7);
                    }

                    goto label_186;
                }

                if(v0.mLeft.mTarget == null && v0.mRight.mTarget != null) {
                    if(v6 != 0) {
                        v1.dependsOn(v3, v14, arg18.getResolutionWidth());
                    }
                    else {
                        v1.dependsOn(v3, -v7);
                    }

                    goto label_186;
                }

                if(v0.mLeft.mTarget == null) {
                    goto label_186;
                }

                if(v0.mRight.mTarget == null) {
                    goto label_186;
                }

                if(v6 != 0) {
                    arg18.getResolutionWidth().addDependent(((ResolutionNode)v1));
                    arg18.getResolutionWidth().addDependent(((ResolutionNode)v3));
                }

                if(v0.mDimensionRatio == 0f) {
                    v1.setType(v11);
                    v3.setType(v11);
                    v1.setOpposite(v3, 0f);
                    v3.setOpposite(v1, 0f);
                    goto label_186;
                }

                v1.setType(v15);
                v3.setType(v15);
                v1.setOpposite(v3, ((float)(-v7)));
                v3.setOpposite(v1, ((float)v7));
                v0.setWidth(v7);
                goto label_186;
            }

            if(v0.mLeft.mTarget == null && v0.mRight.mTarget == null) {
                v1.setType(1);
                v3.setType(1);
                if(v6 != 0) {
                    v3.dependsOn(v1, 1, arg18.getResolutionWidth());
                }
                else {
                    v3.dependsOn(v1, arg18.getWidth());
                }

                goto label_186;
            }

            if(v0.mLeft.mTarget != null && v0.mRight.mTarget == null) {
                v1.setType(1);
                v3.setType(1);
                if(v6 != 0) {
                    v3.dependsOn(v1, 1, arg18.getResolutionWidth());
                }
                else {
                    v3.dependsOn(v1, arg18.getWidth());
                }

                goto label_186;
            }

            if(v0.mLeft.mTarget == null && v0.mRight.mTarget != null) {
                v1.setType(1);
                v3.setType(1);
                v1.dependsOn(v3, -arg18.getWidth());
                if(v6 != 0) {
                    v1.dependsOn(v3, v14, arg18.getResolutionWidth());
                }
                else {
                    v1.dependsOn(v3, -arg18.getWidth());
                }

                goto label_186;
            }

            if(v0.mLeft.mTarget == null) {
                goto label_186;
            }

            if(v0.mRight.mTarget == null) {
                goto label_186;
            }

            v1.setType(v15);
            v3.setType(v15);
            if(v6 != 0) {
                arg18.getResolutionWidth().addDependent(((ResolutionNode)v1));
                arg18.getResolutionWidth().addDependent(((ResolutionNode)v3));
                v1.setOpposite(v3, v14, arg18.getResolutionWidth());
                v3.setOpposite(v1, 1, arg18.getResolutionWidth());
                goto label_186;
            }

            v1.setOpposite(v3, ((float)(-arg18.getWidth())));
            v3.setOpposite(v1, ((float)arg18.getWidth()));
        }

    label_186:
        int v16 = v0.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT || !Optimizer.optimizableMatchConstraint(v0, 1) ? 0 : 1;
        if(v2.type != v12 && v4.type != v12) {
            if(v0.mListDimensionBehaviors[1] != DimensionBehaviour.FIXED && (v16 == 0 || arg18.getVisibility() != v5)) {
                if(v16 == 0) {
                    return;
                }

                int v1_1 = arg18.getHeight();
                v2.setType(1);
                v4.setType(1);
                if(v0.mTop.mTarget == null && v0.mBottom.mTarget == null) {
                    if(v6 != 0) {
                        v4.dependsOn(v2, 1, arg18.getResolutionHeight());
                    }
                    else {
                        v4.dependsOn(v2, v1_1);
                    }

                    return;
                }

                if(v0.mTop.mTarget != null && v0.mBottom.mTarget == null) {
                    if(v6 != 0) {
                        v4.dependsOn(v2, 1, arg18.getResolutionHeight());
                    }
                    else {
                        v4.dependsOn(v2, v1_1);
                    }

                    return;
                }

                if(v0.mTop.mTarget == null && v0.mBottom.mTarget != null) {
                    if(v6 != 0) {
                        v2.dependsOn(v4, v14, arg18.getResolutionHeight());
                    }
                    else {
                        v2.dependsOn(v4, -v1_1);
                    }

                    return;
                }

                if(v0.mTop.mTarget == null) {
                    return;
                }

                if(v0.mBottom.mTarget == null) {
                    return;
                }

                if(v6 != 0) {
                    arg18.getResolutionHeight().addDependent(((ResolutionNode)v2));
                    arg18.getResolutionWidth().addDependent(((ResolutionNode)v4));
                }

                if(v0.mDimensionRatio == 0f) {
                    v2.setType(v11);
                    v4.setType(v11);
                    v2.setOpposite(v4, 0f);
                    v4.setOpposite(v2, 0f);
                    return;
                }

                v2.setType(v15);
                v4.setType(v15);
                v2.setOpposite(v4, ((float)(-v1_1)));
                v4.setOpposite(v2, ((float)v1_1));
                v0.setHeight(v1_1);
                if(v0.mBaselineDistance <= 0) {
                    return;
                }

                v0.mBaseline.getResolutionNode().dependsOn(1, v2, v0.mBaselineDistance);
                return;
            }

            if(v0.mTop.mTarget == null && v0.mBottom.mTarget == null) {
                v2.setType(1);
                v4.setType(1);
                if(v6 != 0) {
                    v4.dependsOn(v2, 1, arg18.getResolutionHeight());
                }
                else {
                    v4.dependsOn(v2, arg18.getHeight());
                }

                if(v0.mBaseline.mTarget == null) {
                    return;
                }

                v0.mBaseline.getResolutionNode().setType(1);
                v2.dependsOn(1, v0.mBaseline.getResolutionNode(), -v0.mBaselineDistance);
                return;
            }

            if(v0.mTop.mTarget != null && v0.mBottom.mTarget == null) {
                v2.setType(1);
                v4.setType(1);
                if(v6 != 0) {
                    v4.dependsOn(v2, 1, arg18.getResolutionHeight());
                }
                else {
                    v4.dependsOn(v2, arg18.getHeight());
                }

                if(v0.mBaselineDistance <= 0) {
                    return;
                }

                v0.mBaseline.getResolutionNode().dependsOn(1, v2, v0.mBaselineDistance);
                return;
            }

            if(v0.mTop.mTarget == null && v0.mBottom.mTarget != null) {
                v2.setType(1);
                v4.setType(1);
                if(v6 != 0) {
                    v2.dependsOn(v4, v14, arg18.getResolutionHeight());
                }
                else {
                    v2.dependsOn(v4, -arg18.getHeight());
                }

                if(v0.mBaselineDistance <= 0) {
                    return;
                }

                v0.mBaseline.getResolutionNode().dependsOn(1, v2, v0.mBaselineDistance);
                return;
            }

            if(v0.mTop.mTarget == null) {
                return;
            }

            if(v0.mBottom.mTarget == null) {
                return;
            }

            v2.setType(v15);
            v4.setType(v15);
            if(v6 != 0) {
                v2.setOpposite(v4, v14, arg18.getResolutionHeight());
                v4.setOpposite(v2, 1, arg18.getResolutionHeight());
                arg18.getResolutionHeight().addDependent(((ResolutionNode)v2));
                arg18.getResolutionWidth().addDependent(((ResolutionNode)v4));
            }
            else {
                v2.setOpposite(v4, ((float)(-arg18.getHeight())));
                v4.setOpposite(v2, ((float)arg18.getHeight()));
            }

            if(v0.mBaselineDistance <= 0) {
                return;
            }

            v0.mBaseline.getResolutionNode().dependsOn(1, v2, v0.mBaselineDistance);
        }
    }

    static boolean applyChainOptimized(ConstraintWidgetContainer arg20, LinearSystem arg21, int arg22, int arg23, ChainHead arg24) {
        float v1_1;
        LinearSystem v13_1;
        ConstraintWidget v0_1;
        long v16_1;
        float v3_2;
        float v2_1;
        float v0;
        ConstraintWidget v18;
        int v11;
        int v10;
        ConstraintWidget v2 = arg24.mFirst;
        ConstraintWidget v3 = arg24.mLast;
        ConstraintWidget v4 = arg24.mFirstVisibleWidget;
        ConstraintWidget v5 = arg24.mLastVisibleWidget;
        ConstraintWidget v6 = arg24.mHead;
        float v7 = arg24.mTotalWeight;
        int v1 = 2;
        if(arg22 == 0) {
            v10 = v6.mHorizontalChainStyle == 0 ? 1 : 0;
            v11 = v6.mHorizontalChainStyle == 1 ? 1 : 0;
            if(v6.mHorizontalChainStyle != v1) {
                goto label_31;
            }

            goto label_29;
        }
        else {
            v10 = v6.mVerticalChainStyle == 0 ? 1 : 0;
            v11 = v6.mVerticalChainStyle == 1 ? 1 : 0;
            if(v6.mVerticalChainStyle == v1) {
            label_29:
                v1 = 1;
                goto label_46;
            }

        label_31:
            v1 = 0;
        }

    label_46:
        ConstraintWidget v13 = v2;
        int v6_1 = 0;
        int v9 = 0;
        int v12 = 0;
        float v14 = 0f;
        float v15 = 0f;
        while(v12 == 0) {
            int v16 = v12;
            v12 = 8;
            if(v13.getVisibility() != v12) {
                ++v6_1;
                v14 += arg22 == 0 ? ((float)v13.getWidth()) : ((float)v13.getHeight());
                if(v13 != v4) {
                    v14 += ((float)v13.mListAnchors[arg23].getMargin());
                }

                v15 = v15 + (((float)v13.mListAnchors[arg23].getMargin())) + (((float)v13.mListAnchors[arg23 + 1].getMargin()));
            }

            if(v13.getVisibility() != v12 && v13.mListDimensionBehaviors[arg22] == DimensionBehaviour.MATCH_CONSTRAINT) {
                ++v9;
                if(arg22 != 0) {
                    if(v13.mMatchConstraintDefaultHeight != 0) {
                        return 0;
                    }

                    if(v13.mMatchConstraintMinHeight == 0 && v13.mMatchConstraintMaxHeight == 0) {
                        goto label_112;
                    }

                    return 0;
                }
                else if(v13.mMatchConstraintDefaultWidth != 0) {
                    return 0;
                }
                else {
                    if(v13.mMatchConstraintMinWidth == 0 && v13.mMatchConstraintMaxWidth == 0) {
                        goto label_112;
                    }

                    return 0;
                }
            }

        label_112:
            ConstraintAnchor v8 = v13.mListAnchors[arg23 + 1].mTarget;
            if(v8 != null) {
                ConstraintWidget v8_1 = v8.mOwner;
                if(v8_1.mListAnchors[arg23].mTarget == null) {
                    goto label_130;
                }
                else if(v8_1.mListAnchors[arg23].mTarget.mOwner != v13) {
                    goto label_130;
                }
                else {
                    v18 = v8_1;
                }
            }
            else {
            label_130:
                v18 = null;
            }

            if(v18 != null) {
                v12 = v16;
                v13 = v18;
                continue;
            }

            v12 = 1;
        }

        ResolutionAnchor v8_2 = v2.mListAnchors[arg23].getResolutionNode();
        v12 = arg23 + 1;
        ResolutionAnchor v3_1 = v3.mListAnchors[v12].getResolutionNode();
        ConstraintWidget v19 = v2;
        if(v8_2.target != null) {
            if(v3_1.target == null) {
            }
            else {
                if(v8_2.target.state != 1 && v3_1.target.state != 1) {
                    return 0;
                }

                if(v9 > 0 && v9 != v6_1) {
                    return 0;
                }

                if(v1 != 0 || v10 != 0 || v11 != 0) {
                    v0 = v4 != null ? ((float)v4.mListAnchors[arg23].getMargin()) : 0f;
                    if(v5 == null) {
                        goto label_182;
                    }

                    v0 += ((float)v5.mListAnchors[v12].getMargin());
                }
                else {
                    v0 = 0f;
                }

            label_182:
                v2_1 = v8_2.target.resolvedOffset;
                v3_2 = v3_1.target.resolvedOffset;
                v3_2 = v2_1 < v3_2 ? v3_2 - v2_1 - v14 : v2_1 - v3_2 - v14;
                v16_1 = 1;
                if(v9 > 0 && v9 == v6_1) {
                    if(v13.getParent() != null && v13.getParent().mListDimensionBehaviors[arg22] == DimensionBehaviour.WRAP_CONTENT) {
                        return 0;
                    }

                    v3_2 = v3_2 + v14 - v15;
                    if(v10 != 0) {
                        v3_2 -= v15 - v0;
                    }

                    if(v10 != 0) {
                        v2_1 += ((float)v4.mListAnchors[v12].getMargin());
                        v0_1 = v4.mListNextVisibleWidget[arg22];
                        if(v0_1 != null) {
                            v2_1 += ((float)v0_1.mListAnchors[arg23].getMargin());
                        }
                    }

                    goto label_223;
                }

                v13_1 = arg21;
                if(v3_2 < v14) {
                    return 0;
                }

                if(v1 != 0) {
                    v2_1 += (v3_2 - v0) * v19.getHorizontalBiasPercent();
                    goto label_297;
                }
                else {
                    if(v10 == 0 && v11 == 0) {
                        return 1;
                    }

                    if(v10 != 0) {
                        v3_2 -= v0;
                    }
                    else if(v11 != 0) {
                        v3_2 -= v0;
                    }

                    v0 = v3_2 / (((float)(v6_1 + 1)));
                    if(v11 != 0) {
                        v0 = v6_1 > 1 ? v3_2 / (((float)(v6_1 - 1))) : v3_2 / 2f;
                    }

                    v1_1 = v2_1 + v0;
                    if(v11 != 0 && v6_1 > 1) {
                        v1_1 = (((float)v4.mListAnchors[arg23].getMargin())) + v2_1;
                    }

                    if(v10 != 0 && v4 != null) {
                        v1_1 += ((float)v4.mListAnchors[arg23].getMargin());
                    }

                    goto label_390;
                }
            }
        }

        return 0;
        while(true) {
        label_390:
            if(v4 == null) {
                return 1;
            }

            if(LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.nonresolvedWidgets -= v16_1;
                LinearSystem.sMetrics.resolvedWidgets += v16_1;
                LinearSystem.sMetrics.chainConnectionResolved += v16_1;
            }

            v2 = v4.mListNextVisibleWidget[arg22];
            if(v2 != null || v4 == v5) {
                v3_2 = arg22 == 0 ? ((float)v4.getWidth()) : ((float)v4.getHeight());
                v4.mListAnchors[arg23].getResolutionNode().resolve(v8_2.resolvedTarget, v1_1);
                v4.mListAnchors[v12].getResolutionNode().resolve(v8_2.resolvedTarget, v1_1 + v3_2);
                v4.mListAnchors[arg23].getResolutionNode().addResolvedValue(v13_1);
                v4.mListAnchors[v12].getResolutionNode().addResolvedValue(v13_1);
                v1_1 += v3_2 + v0;
            }

            v4 = v2;
        }

    label_297:
        while(v4 != null) {
            if(LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.nonresolvedWidgets -= v16_1;
                LinearSystem.sMetrics.resolvedWidgets += v16_1;
                LinearSystem.sMetrics.chainConnectionResolved += v16_1;
            }

            v0_1 = v4.mListNextVisibleWidget[arg22];
            if(v0_1 != null || v4 == v5) {
                v1_1 = arg22 == 0 ? ((float)v4.getWidth()) : ((float)v4.getHeight());
                v2_1 += ((float)v4.mListAnchors[arg23].getMargin());
                v4.mListAnchors[arg23].getResolutionNode().resolve(v8_2.resolvedTarget, v2_1);
                v2_1 += v1_1;
                v4.mListAnchors[v12].getResolutionNode().resolve(v8_2.resolvedTarget, v2_1);
                v4.mListAnchors[arg23].getResolutionNode().addResolvedValue(v13_1);
                v4.mListAnchors[v12].getResolutionNode().addResolvedValue(v13_1);
                v2_1 += ((float)v4.mListAnchors[v12].getMargin());
            }

            v4 = v0_1;
        }

        return 1;
    label_223:
        while(v4 != null) {
            if(LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.nonresolvedWidgets -= v16_1;
                LinearSystem.sMetrics.resolvedWidgets += v16_1;
                LinearSystem.sMetrics.chainConnectionResolved += v16_1;
            }

            v0_1 = v4.mListNextVisibleWidget[arg22];
            if(v0_1 != null || v4 == v5) {
                v1_1 = v3_2 / (((float)v9));
                if(v7 > 0f) {
                    v1_1 = v4.mWeight[arg22] * v3_2 / v7;
                }

                v2_1 += ((float)v4.mListAnchors[arg23].getMargin());
                v4.mListAnchors[arg23].getResolutionNode().resolve(v8_2.resolvedTarget, v2_1);
                v2_1 += v1_1;
                v4.mListAnchors[v12].getResolutionNode().resolve(v8_2.resolvedTarget, v2_1);
                v4.mListAnchors[arg23].getResolutionNode().addResolvedValue(arg21);
                v4.mListAnchors[v12].getResolutionNode().addResolvedValue(arg21);
                v2_1 += ((float)v4.mListAnchors[v12].getMargin());
            }

            v4 = v0_1;
        }

        return 1;
    }

    static void checkMatchParent(ConstraintWidgetContainer arg5, LinearSystem arg6, ConstraintWidget arg7) {
        int v0;
        int v3 = 2;
        if(arg5.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && arg7.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_PARENT) {
            v0 = arg7.mLeft.mMargin;
            int v1 = arg5.getWidth() - arg7.mRight.mMargin;
            arg7.mLeft.mSolverVariable = arg6.createObjectVariable(arg7.mLeft);
            arg7.mRight.mSolverVariable = arg6.createObjectVariable(arg7.mRight);
            arg6.addEquality(arg7.mLeft.mSolverVariable, v0);
            arg6.addEquality(arg7.mRight.mSolverVariable, v1);
            arg7.mHorizontalResolution = v3;
            arg7.setHorizontalDimension(v0, v1);
        }

        if(arg5.mListDimensionBehaviors[1] != DimensionBehaviour.WRAP_CONTENT && arg7.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_PARENT) {
            v0 = arg7.mTop.mMargin;
            int v5 = arg5.getHeight() - arg7.mBottom.mMargin;
            arg7.mTop.mSolverVariable = arg6.createObjectVariable(arg7.mTop);
            arg7.mBottom.mSolverVariable = arg6.createObjectVariable(arg7.mBottom);
            arg6.addEquality(arg7.mTop.mSolverVariable, v0);
            arg6.addEquality(arg7.mBottom.mSolverVariable, v5);
            if(arg7.mBaselineDistance > 0 || arg7.getVisibility() == 8) {
                arg7.mBaseline.mSolverVariable = arg6.createObjectVariable(arg7.mBaseline);
                arg6.addEquality(arg7.mBaseline.mSolverVariable, arg7.mBaselineDistance + v0);
            }

            arg7.mVerticalResolution = v3;
            arg7.setVerticalDimension(v0, v5);
        }
    }

    private static boolean optimizableMatchConstraint(ConstraintWidget arg4, int arg5) {
        if(arg4.mListDimensionBehaviors[arg5] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return 0;
        }

        int v3 = 1;
        if(arg4.mDimensionRatio != 0f) {
            DimensionBehaviour[] v4 = arg4.mListDimensionBehaviors;
            if(arg5 == 0) {
            }
            else {
                v3 = 0;
            }

            if(v4[v3] == DimensionBehaviour.MATCH_CONSTRAINT) {
                return 0;
            }

            return 0;
        }

        if(arg5 != 0) {
            if(arg4.mMatchConstraintDefaultHeight != 0) {
                return 0;
            }

            if(arg4.mMatchConstraintMinHeight == 0) {
                if(arg4.mMatchConstraintMaxHeight != 0) {
                }
                else {
                    return 1;
                }
            }

            return 0;
        }
        else if(arg4.mMatchConstraintDefaultWidth != 0) {
            return 0;
        }
        else {
            if(arg4.mMatchConstraintMinWidth == 0 && arg4.mMatchConstraintMaxWidth == 0) {
                return 1;
            }

            return 0;
        }

        return 1;
    }
}

