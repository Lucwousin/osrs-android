package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem {
    interface Row {
        void addError(SolverVariable arg1);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem arg1, boolean[] arg2);

        void initFromRow(Row arg1);

        boolean isEmpty();
    }

    private static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    private static int POOL_SIZE = 1000;
    private int TABLE_SIZE;
    public boolean graphOptimizer;
    private boolean[] mAlreadyTestedCandidates;
    final Cache mCache;
    private Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    int mNumColumns;
    int mNumRows;
    private SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    ArrayRow[] mRows;
    private final Row mTempGoal;
    private HashMap mVariables;
    int mVariablesID;
    public static Metrics sMetrics;
    private ArrayRow[] tempClientsCopy;

    static {
    }

    public LinearSystem() {
        super();
        this.mVariablesID = 0;
        this.mVariables = null;
        this.TABLE_SIZE = 0x20;
        this.mMaxColumns = this.TABLE_SIZE;
        this.mRows = null;
        this.graphOptimizer = false;
        this.mAlreadyTestedCandidates = new boolean[this.TABLE_SIZE];
        this.mNumColumns = 1;
        this.mNumRows = 0;
        this.mMaxRows = this.TABLE_SIZE;
        this.mPoolVariables = new SolverVariable[LinearSystem.POOL_SIZE];
        this.mPoolVariablesCount = 0;
        this.tempClientsCopy = new ArrayRow[this.TABLE_SIZE];
        this.mRows = new ArrayRow[this.TABLE_SIZE];
        this.releaseRows();
        this.mCache = new Cache();
        this.mGoal = new GoalRow(this.mCache);
        this.mTempGoal = new ArrayRow(this.mCache);
    }

    private SolverVariable acquireSolverVariable(Type arg3, String arg4) {
        Object v0 = this.mCache.solverVariablePool.acquire();
        if(v0 == null) {
            SolverVariable v0_1 = new SolverVariable(arg3, arg4);
            v0_1.setType(arg3, arg4);
        }
        else {
            ((SolverVariable)v0).reset();
            ((SolverVariable)v0).setType(arg3, arg4);
        }

        if(this.mPoolVariablesCount >= LinearSystem.POOL_SIZE) {
            LinearSystem.POOL_SIZE *= 2;
            this.mPoolVariables = Arrays.copyOf(this.mPoolVariables, LinearSystem.POOL_SIZE);
        }

        SolverVariable[] v3 = this.mPoolVariables;
        int v4 = this.mPoolVariablesCount;
        this.mPoolVariablesCount = v4 + 1;
        v3[v4] = v0;
        return ((SolverVariable)v0);
    }

    public void addCenterPoint(ConstraintWidget arg20, ConstraintWidget arg21, float arg22, int arg23) {
        SolverVariable v5 = this.createObjectVariable(arg20.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.LEFT));
        SolverVariable v7 = this.createObjectVariable(arg20.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.TOP));
        SolverVariable v3 = this.createObjectVariable(arg20.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.RIGHT));
        SolverVariable v8 = this.createObjectVariable(arg20.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.BOTTOM));
        SolverVariable v1 = this.createObjectVariable(arg21.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.LEFT));
        SolverVariable v9 = this.createObjectVariable(arg21.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.TOP));
        SolverVariable v12 = this.createObjectVariable(arg21.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.RIGHT));
        SolverVariable v10 = this.createObjectVariable(arg21.getAnchor(androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type.BOTTOM));
        ArrayRow v2 = this.createRow();
        double v13 = ((double)arg22);
        SolverVariable v17 = v3;
        double v3_1 = ((double)arg23);
        v2.createRowWithAngle(v7, v8, v9, v10, ((float)(Math.sin(v13) * v3_1)));
        this.addConstraint(v2);
        v2 = this.createRow();
        v2.createRowWithAngle(v5, v17, v1, v12, ((float)(Math.cos(v13) * v3_1)));
        this.addConstraint(v2);
    }

    public void addCentering(SolverVariable arg12, SolverVariable arg13, int arg14, float arg15, SolverVariable arg16, SolverVariable arg17, int arg18, int arg19) {
        int v1 = arg19;
        ArrayRow v10 = this.createRow();
        v10.createRowCentering(arg12, arg13, arg14, arg15, arg16, arg17, arg18);
        if(v1 != 6) {
            v10.addError(this, v1);
        }

        this.addConstraint(v10);
    }

    public void addConstraint(ArrayRow arg8) {
        if(arg8 == null) {
            return;
        }

        long v1 = 1;
        if(LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.constraints += v1;
            if(arg8.isSimpleDefinition) {
                LinearSystem.sMetrics.simpleconstraints += v1;
            }
        }

        if(this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
            this.increaseTableSize();
        }

        int v0 = 0;
        if(!arg8.isSimpleDefinition) {
            this.updateRowFromVariables(arg8);
            if(arg8.isEmpty()) {
                return;
            }
            else {
                arg8.ensurePositiveConstant();
                if(arg8.chooseSubject(this)) {
                    SolverVariable v0_1 = this.createExtraVariable();
                    arg8.variable = v0_1;
                    this.addRow(arg8);
                    this.mTempGoal.initFromRow(((Row)arg8));
                    this.optimize(this.mTempGoal, true);
                    if(v0_1.definitionId == -1) {
                        if(arg8.variable == v0_1) {
                            v0_1 = arg8.pickPivot(v0_1);
                            if(v0_1 != null) {
                                if(LinearSystem.sMetrics != null) {
                                    LinearSystem.sMetrics.pivots += v1;
                                }

                                arg8.pivot(v0_1);
                            }
                        }

                        if(!arg8.isSimpleDefinition) {
                            arg8.variable.updateReferencesWithNewDefinition(arg8);
                        }

                        --this.mNumRows;
                    }

                    v0 = 1;
                }

                if(arg8.hasKeyVariable()) {
                    goto label_67;
                }

                return;
            }
        }

    label_67:
        if(v0 == 0) {
            this.addRow(arg8);
        }
    }

    public ArrayRow addEquality(SolverVariable arg2, SolverVariable arg3, int arg4, int arg5) {
        ArrayRow v0 = this.createRow();
        v0.createRowEquals(arg2, arg3, arg4);
        if(arg5 != 6) {
            v0.addError(this, arg5);
        }

        this.addConstraint(v0);
        return v0;
    }

    public void addEquality(SolverVariable arg4, int arg5) {
        ArrayRow v0_1;
        int v0 = arg4.definitionId;
        if(arg4.definitionId != -1) {
            v0_1 = this.mRows[v0];
            if(v0_1.isSimpleDefinition) {
                v0_1.constantValue = ((float)arg5);
            }
            else if(v0_1.variables.currentSize == 0) {
                v0_1.isSimpleDefinition = true;
                v0_1.constantValue = ((float)arg5);
            }
            else {
                v0_1 = this.createRow();
                v0_1.createRowEquals(arg4, arg5);
                this.addConstraint(v0_1);
            }
        }
        else {
            v0_1 = this.createRow();
            v0_1.createRowDefinition(arg4, arg5);
            this.addConstraint(v0_1);
        }
    }

    public void addEquality(SolverVariable arg4, int arg5, int arg6) {
        ArrayRow v0_1;
        int v0 = arg4.definitionId;
        if(arg4.definitionId != -1) {
            v0_1 = this.mRows[v0];
            if(v0_1.isSimpleDefinition) {
                v0_1.constantValue = ((float)arg5);
            }
            else {
                v0_1 = this.createRow();
                v0_1.createRowEquals(arg4, arg5);
                v0_1.addError(this, arg6);
                this.addConstraint(v0_1);
            }
        }
        else {
            v0_1 = this.createRow();
            v0_1.createRowDefinition(arg4, arg5);
            v0_1.addError(this, arg6);
            this.addConstraint(v0_1);
        }
    }

    private void addError(ArrayRow arg2) {
        arg2.addError(this, 0);
    }

    public void addGreaterBarrier(SolverVariable arg4, SolverVariable arg5, boolean arg6) {
        ArrayRow v0 = this.createRow();
        SolverVariable v1 = this.createSlackVariable();
        v1.strength = 0;
        v0.createRowGreaterThan(arg4, arg5, v1, 0);
        if(arg6) {
            this.addSingleError(v0, ((int)(v0.variables.get(v1) * -1f)), 1);
        }

        this.addConstraint(v0);
    }

    public void addGreaterThan(SolverVariable arg4, int arg5) {
        ArrayRow v0 = this.createRow();
        SolverVariable v1 = this.createSlackVariable();
        v1.strength = 0;
        v0.createRowGreaterThan(arg4, arg5, v1);
        this.addConstraint(v0);
    }

    public void addGreaterThan(SolverVariable arg4, SolverVariable arg5, int arg6, int arg7) {
        ArrayRow v0 = this.createRow();
        SolverVariable v1 = this.createSlackVariable();
        v1.strength = 0;
        v0.createRowGreaterThan(arg4, arg5, v1, arg6);
        if(arg7 != 6) {
            this.addSingleError(v0, ((int)(v0.variables.get(v1) * -1f)), arg7);
        }

        this.addConstraint(v0);
    }

    public void addLowerBarrier(SolverVariable arg4, SolverVariable arg5, boolean arg6) {
        ArrayRow v0 = this.createRow();
        SolverVariable v1 = this.createSlackVariable();
        v1.strength = 0;
        v0.createRowLowerThan(arg4, arg5, v1, 0);
        if(arg6) {
            this.addSingleError(v0, ((int)(v0.variables.get(v1) * -1f)), 1);
        }

        this.addConstraint(v0);
    }

    public void addLowerThan(SolverVariable arg4, SolverVariable arg5, int arg6, int arg7) {
        ArrayRow v0 = this.createRow();
        SolverVariable v1 = this.createSlackVariable();
        v1.strength = 0;
        v0.createRowLowerThan(arg4, arg5, v1, arg6);
        if(arg7 != 6) {
            this.addSingleError(v0, ((int)(v0.variables.get(v1) * -1f)), arg7);
        }

        this.addConstraint(v0);
    }

    public void addRatio(SolverVariable arg8, SolverVariable arg9, SolverVariable arg10, SolverVariable arg11, float arg12, int arg13) {
        ArrayRow v6 = this.createRow();
        v6.createRowDimensionRatio(arg8, arg9, arg10, arg11, arg12);
        if(arg13 != 6) {
            v6.addError(this, arg13);
        }

        this.addConstraint(v6);
    }

    private final void addRow(ArrayRow arg4) {
        if(this.mRows[this.mNumRows] != null) {
            this.mCache.arrayRowPool.release(this.mRows[this.mNumRows]);
        }

        this.mRows[this.mNumRows] = arg4;
        arg4.variable.definitionId = this.mNumRows;
        ++this.mNumRows;
        arg4.variable.updateReferencesWithNewDefinition(arg4);
    }

    private void addSingleError(ArrayRow arg2, int arg3) {
        this.addSingleError(arg2, arg3, 0);
    }

    void addSingleError(ArrayRow arg2, int arg3, int arg4) {
        arg2.addSingleError(this.createErrorVariable(arg4, null), arg3);
    }

    private void computeValues() {
        int v0;
        for(v0 = 0; v0 < this.mNumRows; ++v0) {
            this.mRows[v0].variable.computedValue = this.mRows[v0].constantValue;
        }
    }

    public SolverVariable createErrorVariable(int arg6, String arg7) {
        if(LinearSystem.sMetrics != null) {
            ++LinearSystem.sMetrics.errors;
        }

        if(this.mNumColumns + 1 >= this.mMaxColumns) {
            this.increaseTableSize();
        }

        SolverVariable v7 = this.acquireSolverVariable(Type.ERROR, arg7);
        ++this.mVariablesID;
        ++this.mNumColumns;
        v7.id = this.mVariablesID;
        v7.strength = arg6;
        this.mCache.mIndexedVariables[this.mVariablesID] = v7;
        this.mGoal.addError(v7);
        return v7;
    }

    public SolverVariable createExtraVariable() {
        if(LinearSystem.sMetrics != null) {
            ++LinearSystem.sMetrics.extravariables;
        }

        if(this.mNumColumns + 1 >= this.mMaxColumns) {
            this.increaseTableSize();
        }

        SolverVariable v0 = this.acquireSolverVariable(Type.SLACK, null);
        ++this.mVariablesID;
        ++this.mNumColumns;
        v0.id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = v0;
        return v0;
    }

    public SolverVariable createObjectVariable(Object arg4) {
        SolverVariable v0 = null;
        if(arg4 == null) {
            return v0;
        }

        if(this.mNumColumns + 1 >= this.mMaxColumns) {
            this.increaseTableSize();
        }

        if((arg4 instanceof ConstraintAnchor)) {
            v0 = ((ConstraintAnchor)arg4).getSolverVariable();
            if(v0 == null) {
                ((ConstraintAnchor)arg4).resetSolverVariable(this.mCache);
                v0 = ((ConstraintAnchor)arg4).getSolverVariable();
            }

            int v1 = -1;
            if(v0.id != v1 && v0.id <= this.mVariablesID && this.mCache.mIndexedVariables[v0.id] != null) {
                return v0;
            }

            if(v0.id != v1) {
                v0.reset();
            }

            ++this.mVariablesID;
            ++this.mNumColumns;
            v0.id = this.mVariablesID;
            v0.mType = Type.UNRESTRICTED;
            this.mCache.mIndexedVariables[this.mVariablesID] = v0;
        }

        return v0;
    }

    public ArrayRow createRow() {
        ArrayRow v0_1;
        Object v0 = this.mCache.arrayRowPool.acquire();
        if(v0 == null) {
            v0_1 = new ArrayRow(this.mCache);
        }
        else {
            ((ArrayRow)v0).reset();
        }

        SolverVariable.increaseErrorId();
        return v0_1;
    }

    public static ArrayRow createRowCentering(LinearSystem arg9, SolverVariable arg10, SolverVariable arg11, int arg12, float arg13, SolverVariable arg14, SolverVariable arg15, int arg16, boolean arg17) {
        ArrayRow v8 = arg9.createRow();
        v8.createRowCentering(arg10, arg11, arg12, arg13, arg14, arg15, arg16);
        if(arg17) {
            v8.addError(arg9, 4);
        }

        return v8;
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem arg1, SolverVariable arg2, SolverVariable arg3, SolverVariable arg4, float arg5, boolean arg6) {
        ArrayRow v0 = arg1.createRow();
        if(arg6) {
            arg1.addError(v0);
        }

        return v0.createRowDimensionPercent(arg2, arg3, arg4, arg5);
    }

    public static ArrayRow createRowEquals(LinearSystem arg1, SolverVariable arg2, SolverVariable arg3, int arg4, boolean arg5) {
        ArrayRow v0 = arg1.createRow();
        v0.createRowEquals(arg2, arg3, arg4);
        if(arg5) {
            arg1.addSingleError(v0, 1);
        }

        return v0;
    }

    public static ArrayRow createRowGreaterThan(LinearSystem arg2, SolverVariable arg3, SolverVariable arg4, int arg5, boolean arg6) {
        SolverVariable v0 = arg2.createSlackVariable();
        ArrayRow v1 = arg2.createRow();
        v1.createRowGreaterThan(arg3, arg4, v0, arg5);
        if(arg6) {
            arg2.addSingleError(v1, ((int)(v1.variables.get(v0) * -1f)));
        }

        return v1;
    }

    public static ArrayRow createRowLowerThan(LinearSystem arg2, SolverVariable arg3, SolverVariable arg4, int arg5, boolean arg6) {
        SolverVariable v0 = arg2.createSlackVariable();
        ArrayRow v1 = arg2.createRow();
        v1.createRowLowerThan(arg3, arg4, v0, arg5);
        if(arg6) {
            arg2.addSingleError(v1, ((int)(v1.variables.get(v0) * -1f)));
        }

        return v1;
    }

    public SolverVariable createSlackVariable() {
        if(LinearSystem.sMetrics != null) {
            ++LinearSystem.sMetrics.slackvariables;
        }

        if(this.mNumColumns + 1 >= this.mMaxColumns) {
            this.increaseTableSize();
        }

        SolverVariable v0 = this.acquireSolverVariable(Type.SLACK, null);
        ++this.mVariablesID;
        ++this.mNumColumns;
        v0.id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = v0;
        return v0;
    }

    private SolverVariable createVariable(String arg6, Type arg7) {
        if(LinearSystem.sMetrics != null) {
            ++LinearSystem.sMetrics.variables;
        }

        if(this.mNumColumns + 1 >= this.mMaxColumns) {
            this.increaseTableSize();
        }

        SolverVariable v7 = this.acquireSolverVariable(arg7, null);
        v7.setName(arg6);
        ++this.mVariablesID;
        ++this.mNumColumns;
        v7.id = this.mVariablesID;
        if(this.mVariables == null) {
            this.mVariables = new HashMap();
        }

        this.mVariables.put(arg6, v7);
        this.mCache.mIndexedVariables[this.mVariablesID] = v7;
        return v7;
    }

    void displayReadableRows() {
        this.displaySolverVariables();
        String v0 = " #  ";
        int v1;
        for(v1 = 0; v1 < this.mNumRows; ++v1) {
            v0 = v0 + this.mRows[v1].toReadableString();
            v0 = v0 + "\n #  ";
        }

        if(this.mGoal != null) {
            v0 = v0 + this.mGoal + "\n";
        }

        System.out.println(v0);
    }

    private void displayRows() {
        this.displaySolverVariables();
        String v0 = "";
        int v1;
        for(v1 = 0; v1 < this.mNumRows; ++v1) {
            v0 = v0 + this.mRows[v1];
            v0 = v0 + "\n";
        }

        System.out.println(v0 + this.mGoal + "\n");
    }

    private void displaySolverVariables() {
        System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    void displaySystemInformations() {
        int v1 = 0;
        int v2 = 0;
        while(v1 < this.TABLE_SIZE) {
            if(this.mRows[v1] != null) {
                v2 += this.mRows[v1].sizeInBytes();
            }

            ++v1;
        }

        v1 = 0;
        int v3 = 0;
        while(v1 < this.mNumRows) {
            if(this.mRows[v1] != null) {
                v3 += this.mRows[v1].sizeInBytes();
            }

            ++v1;
        }

        PrintStream v1_1 = System.out;
        v1_1.println("Linear System -> Table size: " + this.TABLE_SIZE + " (" + this.getDisplaySize(this.TABLE_SIZE * this.TABLE_SIZE) + ") -- row sizes: " + this.getDisplaySize(v2) + ", actual size: " + this.getDisplaySize(v3) + " rows: " + this.mNumRows + "/" + this.mMaxRows + " cols: " + this.mNumColumns + "/" + this.mMaxColumns + " " + 0 + " occupied cells, " + this.getDisplaySize(0));
    }

    public void displayVariablesReadableRows() {
        this.displaySolverVariables();
        String v0 = "";
        int v1;
        for(v1 = 0; v1 < this.mNumRows; ++v1) {
            if(this.mRows[v1].variable.mType == Type.UNRESTRICTED) {
                v0 = v0 + this.mRows[v1].toReadableString();
                v0 = v0 + "\n";
            }
        }

        System.out.println(v0 + this.mGoal + "\n");
    }

    private int enforceBFS(Row arg19) throws Exception {
        int v16;
        int v3;
        float v4;
        LinearSystem v0 = this;
        int v2;
        for(v2 = 0; true; ++v2) {
            v4 = 0f;
            if(v2 >= v0.mNumRows) {
                break;
            }

            if(v0.mRows[v2].variable.mType == Type.UNRESTRICTED) {
            }
            else if(v0.mRows[v2].constantValue < 0f) {
                v2 = 1;
                goto label_21;
            }
        }

        v2 = 0;
    label_21:
        if(v2 != 0) {
            v2 = 0;
            v3 = 0;
            goto label_24;
        }
        else {
            v16 = 0;
            return v16;
        label_24:
            while(v2 == 0) {
                long v7 = 1;
                if(LinearSystem.sMetrics != null) {
                    LinearSystem.sMetrics.bfs += v7;
                }

                ++v3;
                int v9 = -1;
                int v6 = 0;
                int v10 = -1;
                int v11 = -1;
                float v12 = 3.402823E+38f;
                int v13 = 0;
                while(v6 < v0.mNumRows) {
                    ArrayRow v14 = v0.mRows[v6];
                    if(v14.variable.mType == Type.UNRESTRICTED) {
                    }
                    else if(v14.isSimpleDefinition) {
                    }
                    else if(v14.constantValue < v4) {
                        int v1 = 1;
                        while(v1 < v0.mNumColumns) {
                            SolverVariable v15 = v0.mCache.mIndexedVariables[v1];
                            float v5 = v14.variables.get(v15);
                            if(v5 <= v4) {
                            }
                            else {
                                int v4_1 = v13;
                                float v13_1 = v12;
                                int v12_1 = v11;
                                v11 = v10;
                                for(v10 = 0; v10 < 7; ++v10) {
                                    float v7_1 = v15.strengthVector[v10] / v5;
                                    if(v7_1 < v13_1 && v10 == v4_1 || v10 > v4_1) {
                                        v12_1 = v1;
                                        v11 = v6;
                                        v13_1 = v7_1;
                                        v4_1 = v10;
                                    }
                                }

                                v10 = v11;
                                v11 = v12_1;
                                v12 = v13_1;
                                v13 = v4_1;
                            }

                            ++v1;
                            v4 = 0f;
                        }
                    }

                    ++v6;
                    v4 = 0f;
                }

                if(v10 != v9) {
                    ArrayRow v1_1 = v0.mRows[v10];
                    v1_1.variable.definitionId = v9;
                    if(LinearSystem.sMetrics != null) {
                        ++LinearSystem.sMetrics.pivots;
                    }

                    v1_1.pivot(v0.mCache.mIndexedVariables[v11]);
                    v1_1.variable.definitionId = v10;
                    v1_1.variable.updateReferencesWithNewDefinition(v1_1);
                }
                else {
                    v2 = 1;
                }

                if(v3 > v0.mNumColumns / 2) {
                    v2 = 1;
                }

                v4 = 0f;
            }

            v16 = v3;
        }

        return v16;
    }

    public void fillMetrics(Metrics arg1) {
        LinearSystem.sMetrics = arg1;
    }

    public Cache getCache() {
        return this.mCache;
    }

    private String getDisplaySize(int arg3) {
        arg3 *= 4;
        int v0 = arg3 / 0x400;
        int v1 = v0 / 0x400;
        if(v1 > 0) {
            return "" + v1 + " Mb";
        }

        if(v0 > 0) {
            return "" + v0 + " Kb";
        }

        return "" + arg3 + " bytes";
    }

    private String getDisplayStrength(int arg2) {
        if(arg2 == 1) {
            return "LOW";
        }

        if(arg2 == 2) {
            return "MEDIUM";
        }

        if(arg2 == 3) {
            return "HIGH";
        }

        if(arg2 == 4) {
            return "HIGHEST";
        }

        if(arg2 == 5) {
            return "EQUALITY";
        }

        if(arg2 == 6) {
            return "FIXED";
        }

        return "NONE";
    }

    Row getGoal() {
        return this.mGoal;
    }

    public int getMemoryUsed() {
        int v0 = 0;
        int v1 = 0;
        while(v0 < this.mNumRows) {
            if(this.mRows[v0] != null) {
                v1 += this.mRows[v0].sizeInBytes();
            }

            ++v0;
        }

        return v1;
    }

    public static Metrics getMetrics() {
        return LinearSystem.sMetrics;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    public int getObjectVariableValue(Object arg2) {
        SolverVariable v2 = ((ConstraintAnchor)arg2).getSolverVariable();
        if(v2 != null) {
            return ((int)(v2.computedValue + 0.5f));
        }

        return 0;
    }

    ArrayRow getRow(int arg2) {
        return this.mRows[arg2];
    }

    float getValueFor(String arg2) {
        SolverVariable v2 = this.getVariable(arg2, Type.UNRESTRICTED);
        if(v2 == null) {
            return 0;
        }

        return v2.computedValue;
    }

    SolverVariable getVariable(String arg2, Type arg3) {
        SolverVariable v0_1;
        if(this.mVariables == null) {
            this.mVariables = new HashMap();
        }

        Object v0 = this.mVariables.get(arg2);
        if(v0 == null) {
            v0_1 = this.createVariable(arg2, arg3);
        }

        return v0_1;
    }

    private void increaseTableSize() {
        this.TABLE_SIZE *= 2;
        this.mRows = Arrays.copyOf(this.mRows, this.TABLE_SIZE);
        this.mCache.mIndexedVariables = Arrays.copyOf(this.mCache.mIndexedVariables, this.TABLE_SIZE);
        this.mAlreadyTestedCandidates = new boolean[this.TABLE_SIZE];
        this.mMaxColumns = this.TABLE_SIZE;
        this.mMaxRows = this.TABLE_SIZE;
        if(LinearSystem.sMetrics != null) {
            ++LinearSystem.sMetrics.tableSizeIncrease;
            LinearSystem.sMetrics.maxTableSize = Math.max(LinearSystem.sMetrics.maxTableSize, ((long)this.TABLE_SIZE));
            LinearSystem.sMetrics.lastTableSize = LinearSystem.sMetrics.maxTableSize;
        }
    }

    public void minimize() throws Exception {
        long v1 = 1;
        if(LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.minimize += v1;
        }

        if(this.graphOptimizer) {
            if(LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.graphOptimizer += v1;
            }

            int v0 = 0;
            int v3 = 0;
            while(true) {
                if(v3 >= this.mNumRows) {
                    break;
                }
                else if(!this.mRows[v3].isSimpleDefinition) {
                }
                else {
                    ++v3;
                    continue;
                }

                goto label_27;
            }

            v0 = 1;
        label_27:
            if(v0 == 0) {
                this.minimizeGoal(this.mGoal);
                return;
            }

            if(LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.fullySolved += v1;
            }

            this.computeValues();
        }
        else {
            this.minimizeGoal(this.mGoal);
        }
    }

    void minimizeGoal(Row arg6) throws Exception {
        if(LinearSystem.sMetrics != null) {
            ++LinearSystem.sMetrics.minimizeGoal;
            LinearSystem.sMetrics.maxVariables = Math.max(LinearSystem.sMetrics.maxVariables, ((long)this.mNumColumns));
            LinearSystem.sMetrics.maxRows = Math.max(LinearSystem.sMetrics.maxRows, ((long)this.mNumRows));
        }

        this.updateRowFromVariables(arg6);
        this.enforceBFS(arg6);
        this.optimize(arg6, false);
        this.computeValues();
    }

    private final int optimize(Row arg14, boolean arg15) {
        long v0 = 1;
        if(LinearSystem.sMetrics != null) {
            LinearSystem.sMetrics.optimize += v0;
        }

        int v2;
        for(v2 = 0; v2 < this.mNumColumns; ++v2) {
            this.mAlreadyTestedCandidates[v2] = false;
        }

        v2 = 0;
        int v3 = 0;
        while(true) {
        label_17:
            if(v2 != 0) {
                return v3;
            }

            if(LinearSystem.sMetrics != null) {
                LinearSystem.sMetrics.iterations += v0;
            }

            ++v3;
            if(v3 >= this.mNumColumns * 2) {
                return v3;
            }

            if(arg14.getKey() != null) {
                this.mAlreadyTestedCandidates[arg14.getKey().id] = true;
            }

            SolverVariable v4 = arg14.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if(v4 != null) {
                if(this.mAlreadyTestedCandidates[v4.id]) {
                    return v3;
                }
                else {
                    this.mAlreadyTestedCandidates[v4.id] = true;
                }
            }

            if(v4 != null) {
                int v7 = -1;
                int v6 = 0;
                int v8 = -1;
                float v9 = 3.402823E+38f;
                while(v6 < this.mNumRows) {
                    ArrayRow v10 = this.mRows[v6];
                    if(v10.variable.mType == Type.UNRESTRICTED) {
                    }
                    else if(v10.isSimpleDefinition) {
                    }
                    else if(v10.hasVariable(v4)) {
                        float v11 = v10.variables.get(v4);
                        if(v11 < 0f) {
                            float v10_1 = -v10.constantValue / v11;
                            if(v10_1 < v9) {
                                v8 = v6;
                                v9 = v10_1;
                            }
                        }
                    }

                    ++v6;
                }

                if(v8 <= v7) {
                    break;
                }

                ArrayRow v5 = this.mRows[v8];
                v5.variable.definitionId = v7;
                if(LinearSystem.sMetrics != null) {
                    LinearSystem.sMetrics.pivots += v0;
                }

                v5.pivot(v4);
                v5.variable.definitionId = v8;
                v5.variable.updateReferencesWithNewDefinition(v5);
                continue;
            }

            break;
        }

        v2 = 1;
        goto label_17;
        return v3;
    }

    private void releaseRows() {
        int v0;
        for(v0 = 0; v0 < this.mRows.length; ++v0) {
            ArrayRow v1 = this.mRows[v0];
            if(v1 != null) {
                this.mCache.arrayRowPool.release(v1);
            }

            this.mRows[v0] = null;
        }
    }

    public void reset() {
        int v1;
        for(v1 = 0; v1 < this.mCache.mIndexedVariables.length; ++v1) {
            SolverVariable v2 = this.mCache.mIndexedVariables[v1];
            if(v2 != null) {
                v2.reset();
            }
        }

        this.mCache.solverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, null);
        if(this.mVariables != null) {
            this.mVariables.clear();
        }

        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for(v1 = 0; v1 < this.mNumRows; ++v1) {
            this.mRows[v1].used = false;
        }

        this.releaseRows();
        this.mNumRows = 0;
    }

    private final void updateRowFromVariables(ArrayRow arg3) {
        if(this.mNumRows > 0) {
            arg3.variables.updateFromSystem(arg3, this.mRows);
            if(arg3.variables.currentSize == 0) {
                arg3.isSimpleDefinition = true;
            }
        }
    }
}

