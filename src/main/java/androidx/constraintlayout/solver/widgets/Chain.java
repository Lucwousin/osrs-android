package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

class Chain {
    private static final boolean DEBUG = false;

    Chain() {
        super();
    }

    static void applyChainConstraints(ConstraintWidgetContainer arg7, LinearSystem arg8, int arg9) {
        int v3;
        ChainHead[] v2;
        int v1;
        int v0 = 0;
        if(arg9 == 0) {
            v1 = arg7.mHorizontalChainsSize;
            v2 = arg7.mHorizontalChainsArray;
            v3 = v1;
            v1 = 0;
        }
        else {
            v1 = 2;
            v3 = arg7.mVerticalChainsSize;
            v2 = arg7.mVerticalChainsArray;
        }

        while(v0 < v3) {
            ChainHead v4 = v2[v0];
            v4.define();
            if(!arg7.optimizeFor(4)) {
                Chain.applyChainConstraints(arg7, arg8, arg9, v1, v4);
            }
            else if(!Optimizer.applyChainOptimized(arg7, arg8, arg9, v1, v4)) {
                Chain.applyChainConstraints(arg7, arg8, arg9, v1, v4);
            }

            ++v0;
        }
    }

    static void applyChainConstraints(ConstraintWidgetContainer arg47, LinearSystem arg48, int arg49, int arg50, ChainHead arg51) {
        ConstraintAnchor v10_1;
        ConstraintWidget v19_1;
        ConstraintAnchor v46;
        SolverVariable v45;
        ConstraintWidget v44;
        ConstraintWidget v15_1;
        ConstraintWidget v20;
        ConstraintAnchor v43;
        ConstraintAnchor v42;
        SolverVariable v7_3;
        ConstraintWidget v41;
        ConstraintAnchor v6_4;
        int v1_2;
        SolverVariable v2_5;
        ConstraintWidget v7_2;
        ConstraintWidget v0_4;
        int v38;
        SolverVariable v5_1;
        SolverVariable v3_2;
        ConstraintAnchor v1_1;
        ConstraintAnchor v0_3;
        SolverVariable v6_3;
        int v15;
        SolverVariable v4_2;
        int v40;
        ArrayList v39;
        float v4_1;
        int v2_2;
        int v29;
        ConstraintWidget v28;
        int v26;
        ConstraintWidget v27;
        int v3_1;
        float v25;
        ConstraintAnchor v8_1;
        ConstraintWidget v21;
        int v6;
        int v8;
        ConstraintWidgetContainer v0 = arg47;
        LinearSystem v9 = arg48;
        ChainHead v1 = arg51;
        ConstraintWidget v11 = v1.mFirst;
        ConstraintWidget v12 = v1.mLast;
        ConstraintWidget v13 = v1.mFirstVisibleWidget;
        ConstraintWidget v14 = v1.mLastVisibleWidget;
        ConstraintWidget v2 = v1.mHead;
        float v3 = v1.mTotalWeight;
        int v4 = v0.mListDimensionBehaviors[arg49] == DimensionBehaviour.WRAP_CONTENT ? 1 : 0;
        int v5 = 2;
        if(arg49 == 0) {
            v8 = v2.mHorizontalChainStyle == 0 ? 1 : 0;
            v6 = v2.mHorizontalChainStyle == 1 ? 1 : 0;
            if(v2.mHorizontalChainStyle != v5) {
                goto label_35;
            }

            goto label_33;
        }
        else {
            v8 = v2.mVerticalChainStyle == 0 ? 1 : 0;
            v6 = v2.mVerticalChainStyle == 1 ? 1 : 0;
            if(v2.mVerticalChainStyle == v5) {
            label_33:
                v5 = 1;
                goto label_36;
            }

        label_35:
            v5 = 0;
        }

    label_36:
        int v7 = v5;
        int v18 = v6;
        int v17 = v8;
        ConstraintWidget v6_1 = v11;
        v5 = 0;
        while(true) {
            v21 = null;
            if(v5 != 0) {
                break;
            }

            v8_1 = v6_1.mListAnchors[arg50];
            int v23 = v4 != 0 || v7 != 0 ? 1 : 4;
            int v24 = v8_1.getMargin();
            v25 = v3;
            if(v8_1.mTarget != null && v6_1 != v11) {
                v24 += v8_1.mTarget.getMargin();
            }

            v3_1 = v24;
            if(v7 == 0 || v6_1 == v11 || v6_1 == v13) {
                if(v17 != 0 && v4 != 0) {
                    v27 = v2;
                    v26 = v5;
                    v5 = 4;
                    goto label_91;
                }

                v27 = v2;
                v26 = v5;
                v5 = v23;
            }
            else {
                v27 = v2;
                v26 = v5;
                v5 = 6;
            }

        label_91:
            if(v8_1.mTarget != null) {
                if(v6_1 == v13) {
                    v28 = v11;
                    v29 = v7;
                    v9.addGreaterThan(v8_1.mSolverVariable, v8_1.mTarget.mSolverVariable, v3_1, 5);
                }
                else {
                    v29 = v7;
                    v28 = v11;
                    v9.addGreaterThan(v8_1.mSolverVariable, v8_1.mTarget.mSolverVariable, v3_1, 6);
                }

                v9.addEquality(v8_1.mSolverVariable, v8_1.mTarget.mSolverVariable, v3_1, v5);
            }
            else {
                v29 = v7;
                v28 = v11;
            }

            if(v4 != 0) {
                if(v6_1.getVisibility() == 8 || v6_1.mListDimensionBehaviors[arg49] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    v5 = 0;
                }
                else {
                    v5 = 0;
                    v9.addGreaterThan(v6_1.mListAnchors[arg50 + 1].mSolverVariable, v6_1.mListAnchors[arg50].mSolverVariable, 0, 5);
                }

                v9.addGreaterThan(v6_1.mListAnchors[arg50].mSolverVariable, v0.mListAnchors[arg50].mSolverVariable, v5, 6);
            }

            ConstraintAnchor v2_1 = v6_1.mListAnchors[arg50 + 1].mTarget;
            if(v2_1 != null) {
                v2 = v2_1.mOwner;
                if(v2.mListAnchors[arg50].mTarget != null) {
                    if(v2.mListAnchors[arg50].mTarget.mOwner != v6_1) {
                    }
                    else {
                        v21 = v2;
                    }
                }
            }

            if(v21 != null) {
                v6_1 = v21;
                v5 = v26;
            }
            else {
                v5 = 1;
            }

            v3 = v25;
            v2 = v27;
            v11 = v28;
            v7 = v29;
        }

        v27 = v2;
        v25 = v3;
        v29 = v7;
        v28 = v11;
        if(v14 != null) {
            v3_1 = arg50 + 1;
            if(v12.mListAnchors[v3_1].mTarget != null) {
                v9.addLowerThan(v14.mListAnchors[v3_1].mSolverVariable, v12.mListAnchors[v3_1].mTarget.mSolverVariable, -v14.mListAnchors[v3_1].getMargin(), 5);
            }
        }

        if(v4 != 0) {
            v2_2 = arg50 + 1;
            v9.addGreaterThan(v0.mListAnchors[v2_2].mSolverVariable, v12.mListAnchors[v2_2].mSolverVariable, v12.mListAnchors[v2_2].getMargin(), 6);
        }

        ArrayList v0_1 = v1.mWeightedMatchConstraintsWidgets;
        if(v0_1 != null) {
            v2_2 = v0_1.size();
            if(v2_2 > 1) {
                v3 = !v1.mHasUndefinedWeights || (v1.mHasComplexMatchWeights) ? v25 : ((float)v1.mWidgetsMatchCount);
                v4_1 = 0f;
                Object v6_2 = v21;
                v5 = 0;
                float v31 = 0f;
                while(v5 < v2_2) {
                    Object v11_1 = v0_1.get(v5);
                    float v7_1 = ((ConstraintWidget)v11_1).mWeight[arg49];
                    if(v7_1 >= v4_1) {
                    label_248:
                        if(v7_1 == 0f) {
                            v9.addEquality(((ConstraintWidget)v11_1).mListAnchors[arg50 + 1].mSolverVariable, ((ConstraintWidget)v11_1).mListAnchors[arg50].mSolverVariable, 0, 6);
                        label_260:
                            v39 = v0_1;
                            v40 = v2_2;
                        }
                        else {
                            if(v6_2 != null) {
                                v4_2 = ((ConstraintWidget)v6_2).mListAnchors[arg50].mSolverVariable;
                                v15 = arg50 + 1;
                                v6_3 = ((ConstraintWidget)v6_2).mListAnchors[v15].mSolverVariable;
                                SolverVariable v8_2 = ((ConstraintWidget)v11_1).mListAnchors[arg50].mSolverVariable;
                                v39 = v0_1;
                                SolverVariable v0_2 = ((ConstraintWidget)v11_1).mListAnchors[v15].mSolverVariable;
                                v40 = v2_2;
                                ArrayRow v2_3 = arg48.createRow();
                                v2_3.createRowEqualMatchDimensions(v31, v3, v7_1, v4_2, v6_3, v8_2, v0_2);
                                v9.addConstraint(v2_3);
                            }
                            else {
                                v39 = v0_1;
                                v40 = v2_2;
                            }

                            v31 = v7_1;
                            v6_2 = v11_1;
                        }
                    }
                    else if(v1.mHasComplexMatchWeights) {
                        v9.addEquality(((ConstraintWidget)v11_1).mListAnchors[arg50 + 1].mSolverVariable, ((ConstraintWidget)v11_1).mListAnchors[arg50].mSolverVariable, 0, 4);
                        goto label_260;
                    }
                    else {
                        v7_1 = 1f;
                        goto label_248;
                    }

                    ++v5;
                    v0_1 = v39;
                    v2_2 = v40;
                    v4_1 = 0f;
                }
            }
        }

        if(v13 != null) {
            if(v13 != v14 && v29 == 0) {
                goto label_361;
            }

            v11 = v28;
            v0_3 = v11.mListAnchors[arg50];
            v2_2 = arg50 + 1;
            v1_1 = v12.mListAnchors[v2_2];
            v3_2 = v11.mListAnchors[arg50].mTarget != null ? v11.mListAnchors[arg50].mTarget.mSolverVariable : ((SolverVariable)v21);
            v5_1 = v12.mListAnchors[v2_2].mTarget != null ? v12.mListAnchors[v2_2].mTarget.mSolverVariable : ((SolverVariable)v21);
            if(v13 == v14) {
                v0_3 = v13.mListAnchors[arg50];
                v1_1 = v13.mListAnchors[v2_2];
            }

            if(v3_2 == null) {
                goto label_650;
            }

            if(v5_1 == null) {
                goto label_650;
            }

            float v2_4 = arg49 == 0 ? v27.mHorizontalBiasPercent : v27.mVerticalBiasPercent;
            v4_1 = v2_4;
            arg48.addCentering(v0_3.mSolverVariable, v3_2, v0_3.getMargin(), v4_1, v5_1, v1_1.mSolverVariable, v1_1.getMargin(), 5);
        }
        else {
        label_361:
            v11 = v28;
            if(v17 != 0 && v13 != null) {
                v38 = v1.mWidgetsMatchCount <= 0 || v1.mWidgetsCount != v1.mWidgetsMatchCount ? 0 : 1;
                v0_4 = v13;
                ConstraintWidget v8_3;
                for(v8_3 = v0_4; true; v8_3 = v20) {
                    if(v8_3 == null) {
                        goto label_650;
                    }

                    v7_2 = v8_3.mListNextVisibleWidget[arg49];
                    if(v7_2 != null || v8_3 == v14) {
                        v1_1 = v8_3.mListAnchors[arg50];
                        v2_5 = v1_1.mSolverVariable;
                        v3_2 = v1_1.mTarget != null ? v1_1.mTarget.mSolverVariable : ((SolverVariable)v21);
                        if(v0_4 != v8_3) {
                            v3_2 = v0_4.mListAnchors[arg50 + 1].mSolverVariable;
                        }
                        else if(v8_3 == v13 && v0_4 == v8_3) {
                            v3_2 = v11.mListAnchors[arg50].mTarget != null ? v11.mListAnchors[arg50].mTarget.mSolverVariable : ((SolverVariable)v21);
                        }

                        v1_2 = v1_1.getMargin();
                        v5 = arg50 + 1;
                        v4 = v8_3.mListAnchors[v5].getMargin();
                        if(v7_2 != null) {
                            v6_4 = v7_2.mListAnchors[arg50];
                            v41 = v7_2;
                            v7_3 = v6_4.mSolverVariable;
                            v42 = v6_4;
                            v6_3 = v8_3.mListAnchors[v5].mSolverVariable;
                        }
                        else {
                            v41 = v7_2;
                            v6_4 = v12.mListAnchors[v5].mTarget;
                            if(v6_4 != null) {
                                v7_3 = v6_4.mSolverVariable;
                                v43 = v6_4;
                            }
                            else {
                                v43 = v6_4;
                                v7_3 = ((SolverVariable)v21);
                            }

                            v6_3 = v8_3.mListAnchors[v5].mSolverVariable;
                            v42 = v43;
                        }

                        if(v42 != null) {
                            v4 += v42.getMargin();
                        }

                        if(v0_4 != null) {
                            v1_2 += v0_4.mListAnchors[v5].getMargin();
                        }

                        if(v2_5 != null && v3_2 != null && v7_3 != null && v6_3 != null) {
                            v15 = v8_3 == v13 ? v13.mListAnchors[arg50].getMargin() : v1_2;
                            int v16 = v8_3 == v14 ? v14.mListAnchors[v5].getMargin() : v4;
                            int v19 = v38 != 0 ? 6 : 4;
                            SolverVariable v1_3 = v2_5;
                            v2_5 = v3_2;
                            v3_1 = v15;
                            v20 = v41;
                            v15_1 = v8_3;
                            arg48.addCentering(v1_3, v2_5, v3_1, 0.5f, v7_3, v6_3, v16, v19);
                            goto label_489;
                        }

                        v15_1 = v8_3;
                        v20 = v41;
                    }
                    else {
                        v20 = v7_2;
                        v15_1 = v8_3;
                    }

                label_489:
                    v0_4 = v15_1;
                }
            }

            if(v18 == 0) {
                goto label_650;
            }

            if(v13 == null) {
                goto label_650;
            }

            v38 = v1.mWidgetsMatchCount <= 0 || v1.mWidgetsCount != v1.mWidgetsMatchCount ? 0 : 1;
            v0_4 = v13;
            v8_3 = v0_4;
            while(v8_3 != null) {
                ConstraintWidget v1_4 = v8_3.mListNextVisibleWidget[arg49];
                if(v8_3 == v13 || v8_3 == v14 || v1_4 == null) {
                    v20 = v8_3;
                    v8_3 = v1_4;
                }
                else {
                    v7_2 = v1_4 == v14 ? v21 : v1_4;
                    v1_1 = v8_3.mListAnchors[arg50];
                    v2_5 = v1_1.mSolverVariable;
                    v4 = arg50 + 1;
                    v3_2 = v0_4.mListAnchors[v4].mSolverVariable;
                    v1_2 = v1_1.getMargin();
                    v5 = v8_3.mListAnchors[v4].getMargin();
                    if(v7_2 != null) {
                        v6_4 = v7_2.mListAnchors[arg50];
                        v44 = v7_2;
                        v45 = v6_4.mSolverVariable;
                        v7_3 = v6_4.mTarget != null ? v6_4.mTarget.mSolverVariable : ((SolverVariable)v21);
                        v46 = v6_4;
                        v6_3 = v7_3;
                    }
                    else {
                        v44 = v7_2;
                        v6_4 = v8_3.mListAnchors[v4].mTarget;
                        if(v6_4 != null) {
                            v7_3 = v6_4.mSolverVariable;
                            v46 = v6_4;
                        }
                        else {
                            v46 = v6_4;
                            v7_3 = ((SolverVariable)v21);
                        }

                        v6_3 = v8_3.mListAnchors[v4].mSolverVariable;
                        v45 = v7_3;
                    }

                    if(v46 != null) {
                        v5 += v46.getMargin();
                    }

                    v7 = v5;
                    if(v0_4 != null) {
                        v1_2 += v0_4.mListAnchors[v4].getMargin();
                    }

                    v4 = v1_2;
                    v15 = v38 != 0 ? 6 : 4;
                    if(v2_5 == null || v3_2 == null || v45 == null || v6_3 == null) {
                        v20 = v8_3;
                        v19_1 = v44;
                    }
                    else {
                        v19_1 = v44;
                        v20 = v8_3;
                        arg48.addCentering(v2_5, v3_2, v4, 0.5f, v45, v6_3, v7, v15);
                    }

                    v8_3 = v19_1;
                }

                v0_4 = v20;
            }

            int v10 = 5;
            v0_3 = v13.mListAnchors[arg50];
            v1_1 = v11.mListAnchors[arg50].mTarget;
            v3_1 = arg50 + 1;
            ConstraintAnchor v11_2 = v14.mListAnchors[v3_1];
            v8_1 = v12.mListAnchors[v3_1].mTarget;
            if(v1_1 == null) {
            label_641:
                v10_1 = v8_1;
            }
            else if(v13 != v14) {
                v9.addEquality(v0_3.mSolverVariable, v1_1.mSolverVariable, v0_3.getMargin(), v10);
                goto label_641;
            }
            else if(v8_1 != null) {
                v10_1 = v8_1;
                arg48.addCentering(v0_3.mSolverVariable, v1_1.mSolverVariable, v0_3.getMargin(), 0.5f, v11_2.mSolverVariable, v8_1.mSolverVariable, v11_2.getMargin(), 5);
            }
            else {
                goto label_641;
            }

            if(v10_1 == null) {
                goto label_650;
            }

            if(v13 == v14) {
                goto label_650;
            }

            v9.addEquality(v11_2.mSolverVariable, v10_1.mSolverVariable, -v11_2.getMargin(), 5);
        }

    label_650:
        if((v17 != 0 || v18 != 0) && v13 != null) {
            v0_3 = v13.mListAnchors[arg50];
            v2_2 = arg50 + 1;
            v1_1 = v14.mListAnchors[v2_2];
            v3_2 = v0_3.mTarget != null ? v0_3.mTarget.mSolverVariable : ((SolverVariable)v21);
            v4_2 = v1_1.mTarget != null ? v1_1.mTarget.mSolverVariable : ((SolverVariable)v21);
            if(v12 != v14) {
                ConstraintAnchor v4_3 = v12.mListAnchors[v2_2];
                v4_2 = v4_3.mTarget != null ? v4_3.mTarget.mSolverVariable : ((SolverVariable)v21);
            }

            v5_1 = v4_2;
            if(v13 == v14) {
                v0_3 = v13.mListAnchors[arg50];
                v1_1 = v13.mListAnchors[v2_2];
            }

            if(v3_2 == null) {
                return;
            }

            if(v5_1 == null) {
                return;
            }

            v4_1 = 0.5f;
            v6 = v0_3.getMargin();
            if(v14 == null) {
            }
            else {
                v12 = v14;
            }

            arg48.addCentering(v0_3.mSolverVariable, v3_2, v6, v4_1, v5_1, v1_1.mSolverVariable, v12.mListAnchors[v2_2].getMargin(), 5);
        }
    }
}

