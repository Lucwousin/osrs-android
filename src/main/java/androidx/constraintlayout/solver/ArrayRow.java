package androidx.constraintlayout.solver;

public class ArrayRow implements Row {
    private static final boolean DEBUG = false;
    float constantValue;
    private static final float epsilon = 0.001f;
    boolean isSimpleDefinition;
    boolean used;
    SolverVariable variable;
    public final ArrayLinkedVariables variables;

    public ArrayRow(Cache arg2) {
        super();
        this.variable = null;
        this.constantValue = 0f;
        this.used = false;
        this.isSimpleDefinition = false;
        this.variables = new ArrayLinkedVariables(this, arg2);
    }

    public ArrayRow addError(LinearSystem arg4, int arg5) {
        this.variables.put(arg4.createErrorVariable(arg5, "ep"), 1f);
        this.variables.put(arg4.createErrorVariable(arg5, "em"), -1f);
        return this;
    }

    public void addError(SolverVariable arg4) {
        float v1 = 1f;
        if(arg4.strength == 1) {
        }
        else if(arg4.strength == 2) {
            v1 = 1000f;
        }
        else if(arg4.strength == 3) {
            v1 = 1000000f;
        }
        else if(arg4.strength == 4) {
            v1 = 1000000000f;
        }
        else if(arg4.strength == 5) {
            v1 = 999999995904f;
        }

        this.variables.put(arg4, v1);
    }

    ArrayRow addSingleError(SolverVariable arg2, int arg3) {
        this.variables.put(arg2, ((float)arg3));
        return this;
    }

    boolean chooseSubject(LinearSystem arg3) {
        boolean v3_1;
        SolverVariable v3 = this.variables.chooseSubject(arg3);
        if(v3 == null) {
            v3_1 = true;
        }
        else {
            this.pivot(v3);
            v3_1 = false;
        }

        if(this.variables.currentSize == 0) {
            this.isSimpleDefinition = true;
        }

        return v3_1;
    }

    public void clear() {
        this.variables.clear();
        this.variable = null;
        this.constantValue = 0f;
    }

    ArrayRow createRowCentering(SolverVariable arg6, SolverVariable arg7, int arg8, float arg9, SolverVariable arg10, SolverVariable arg11, int arg12) {
        float v0 = 1f;
        if(arg7 == arg10) {
            this.variables.put(arg6, v0);
            this.variables.put(arg11, v0);
            this.variables.put(arg7, -2f);
            return this;
        }

        float v2 = -1f;
        if(arg9 == 0.5f) {
            this.variables.put(arg6, v0);
            this.variables.put(arg7, v2);
            this.variables.put(arg10, v2);
            this.variables.put(arg11, v0);
            if(arg8 <= 0 && arg12 <= 0) {
                return this;
            }

            this.constantValue = ((float)(-arg8 + arg12));
        }
        else {
            if(arg9 <= 0f) {
                this.variables.put(arg6, v2);
                this.variables.put(arg7, v0);
                this.constantValue = ((float)arg8);
                return this;
            }

            if(arg9 >= v0) {
                this.variables.put(arg10, v2);
                this.variables.put(arg11, v0);
                this.constantValue = ((float)arg12);
                return this;
            }

            float v3 = v0 - arg9;
            this.variables.put(arg6, v3 * v0);
            this.variables.put(arg7, v3 * v2);
            this.variables.put(arg10, v2 * arg9);
            this.variables.put(arg11, v0 * arg9);
            if(arg8 <= 0 && arg12 <= 0) {
                return this;
            }

            this.constantValue = (((float)(-arg8))) * v3 + (((float)arg12)) * arg9;
        }

        return this;
    }

    ArrayRow createRowDefinition(SolverVariable arg1, int arg2) {
        this.variable = arg1;
        float v2 = ((float)arg2);
        arg1.computedValue = v2;
        this.constantValue = v2;
        this.isSimpleDefinition = true;
        return this;
    }

    ArrayRow createRowDimensionPercent(SolverVariable arg3, SolverVariable arg4, SolverVariable arg5, float arg6) {
        this.variables.put(arg3, -1f);
        this.variables.put(arg4, 1f - arg6);
        this.variables.put(arg5, arg6);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable arg3, SolverVariable arg4, SolverVariable arg5, SolverVariable arg6, float arg7) {
        this.variables.put(arg3, -1f);
        this.variables.put(arg4, 1f);
        this.variables.put(arg5, arg7);
        this.variables.put(arg6, -arg7);
        return this;
    }

    public ArrayRow createRowEqualDimension(float arg4, float arg5, float arg6, SolverVariable arg7, int arg8, SolverVariable arg9, int arg10, SolverVariable arg11, int arg12, SolverVariable arg13, int arg14) {
        float v0 = -1f;
        float v1 = 1f;
        if(arg5 == 0f || arg4 == arg6) {
            this.constantValue = ((float)(-arg8 - arg10 + arg12 + arg14));
            this.variables.put(arg7, v1);
            this.variables.put(arg9, v0);
            this.variables.put(arg13, v1);
            this.variables.put(arg11, v0);
        }
        else {
            arg4 = arg4 / arg5 / (arg6 / arg5);
            this.constantValue = (((float)(-arg8 - arg10))) + (((float)arg12)) * arg4 + (((float)arg14)) * arg4;
            this.variables.put(arg7, v1);
            this.variables.put(arg9, v0);
            this.variables.put(arg13, arg4);
            this.variables.put(arg11, -arg4);
        }

        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float arg5, float arg6, float arg7, SolverVariable arg8, SolverVariable arg9, SolverVariable arg10, SolverVariable arg11) {
        this.constantValue = 0f;
        float v1 = -1f;
        float v2 = 1f;
        if(arg6 == 0f || arg5 == arg7) {
            this.variables.put(arg8, v2);
            this.variables.put(arg9, v1);
            this.variables.put(arg11, v2);
            this.variables.put(arg10, v1);
        }
        else if(arg5 == 0f) {
            this.variables.put(arg8, v2);
            this.variables.put(arg9, v1);
        }
        else if(arg7 == 0f) {
            this.variables.put(arg10, v2);
            this.variables.put(arg11, v1);
        }
        else {
            arg5 = arg5 / arg6 / (arg7 / arg6);
            this.variables.put(arg8, v2);
            this.variables.put(arg9, v1);
            this.variables.put(arg11, arg5);
            this.variables.put(arg10, -arg5);
        }

        return this;
    }

    public ArrayRow createRowEquals(SolverVariable arg3, SolverVariable arg4, int arg5) {
        int v0 = 0;
        if(arg5 != 0) {
            if(arg5 < 0) {
                arg5 *= -1;
                v0 = 1;
            }

            this.constantValue = ((float)arg5);
        }

        float v5 = 1f;
        float v1 = -1f;
        if(v0 == 0) {
            this.variables.put(arg3, v1);
            this.variables.put(arg4, v5);
        }
        else {
            this.variables.put(arg3, v5);
            this.variables.put(arg4, v1);
        }

        return this;
    }

    public ArrayRow createRowEquals(SolverVariable arg2, int arg3) {
        if(arg3 < 0) {
            this.constantValue = ((float)(arg3 * -1));
            this.variables.put(arg2, 1f);
        }
        else {
            this.constantValue = ((float)arg3);
            this.variables.put(arg2, -1f);
        }

        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable arg3, SolverVariable arg4, SolverVariable arg5, int arg6) {
        int v0 = 0;
        if(arg6 != 0) {
            if(arg6 < 0) {
                arg6 *= -1;
                v0 = 1;
            }

            this.constantValue = ((float)arg6);
        }

        float v6 = 1f;
        float v1 = -1f;
        if(v0 == 0) {
            this.variables.put(arg3, v1);
            this.variables.put(arg4, v6);
            this.variables.put(arg5, v6);
        }
        else {
            this.variables.put(arg3, v6);
            this.variables.put(arg4, v1);
            this.variables.put(arg5, v1);
        }

        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable arg1, int arg2, SolverVariable arg3) {
        this.constantValue = ((float)arg2);
        this.variables.put(arg1, -1f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable arg3, SolverVariable arg4, SolverVariable arg5, int arg6) {
        int v0 = 0;
        if(arg6 != 0) {
            if(arg6 < 0) {
                arg6 *= -1;
                v0 = 1;
            }

            this.constantValue = ((float)arg6);
        }

        float v6 = 1f;
        float v1 = -1f;
        if(v0 == 0) {
            this.variables.put(arg3, v1);
            this.variables.put(arg4, v6);
            this.variables.put(arg5, v1);
        }
        else {
            this.variables.put(arg3, v6);
            this.variables.put(arg4, v1);
            this.variables.put(arg5, v6);
        }

        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable arg3, SolverVariable arg4, SolverVariable arg5, SolverVariable arg6, float arg7) {
        this.variables.put(arg5, 0.5f);
        this.variables.put(arg6, 0.5f);
        this.variables.put(arg3, -0.5f);
        this.variables.put(arg4, -0.5f);
        this.constantValue = -arg7;
        return this;
    }

    void ensurePositiveConstant() {
        if(this.constantValue < 0f) {
            this.constantValue *= -1f;
            this.variables.invert();
        }
    }

    public SolverVariable getKey() {
        return this.variable;
    }

    public SolverVariable getPivotCandidate(LinearSystem arg2, boolean[] arg3) {
        return this.variables.getPivotCandidate(arg3, null);
    }

    boolean hasKeyVariable() {
        boolean v0;
        if(this.variable != null) {
            if(this.variable.mType != Type.UNRESTRICTED && this.constantValue < 0f) {
                goto label_11;
            }

            v0 = true;
        }
        else {
        label_11:
            v0 = false;
        }

        return v0;
    }

    boolean hasVariable(SolverVariable arg2) {
        return this.variables.containsKey(arg2);
    }

    public void initFromRow(Row arg6) {
        if((arg6 instanceof ArrayRow)) {
            this.variable = null;
            this.variables.clear();
            int v0;
            for(v0 = 0; v0 < ((ArrayRow)arg6).variables.currentSize; ++v0) {
                this.variables.add(((ArrayRow)arg6).variables.getVariable(v0), ((ArrayRow)arg6).variables.getVariableValue(v0), true);
            }
        }
    }

    public boolean isEmpty() {
        boolean v0 = this.variable != null || this.constantValue != 0f || this.variables.currentSize != 0 ? false : true;
        return v0;
    }

    SolverVariable pickPivot(SolverVariable arg3) {
        return this.variables.getPivotCandidate(null, arg3);
    }

    void pivot(SolverVariable arg4) {
        float v1 = -1f;
        if(this.variable != null) {
            this.variables.put(this.variable, v1);
            this.variable = null;
        }

        float v0 = this.variables.remove(arg4, true) * v1;
        this.variable = arg4;
        if(v0 == 1f) {
            return;
        }

        this.constantValue /= v0;
        this.variables.divideByAmount(v0);
    }

    public void reset() {
        this.variable = null;
        this.variables.clear();
        this.constantValue = 0f;
        this.isSimpleDefinition = false;
    }

    int sizeInBytes() {
        int v1 = 4;
        int v0 = this.variable != null ? 4 : 0;
        return v0 + v1 + v1 + this.variables.sizeInBytes();
    }

    String toReadableString() {
        int v1_1;
        String v0 = "";
        v0 = this.variable == null ? v0 + "0" : v0 + this.variable;
        v0 = v0 + " = ";
        int v2 = 0;
        if(this.constantValue != 0f) {
            v0 = v0 + this.constantValue;
            v1_1 = 1;
        }
        else {
            v1_1 = 0;
        }

        int v5 = this.variables.currentSize;
        while(v2 < v5) {
            SolverVariable v6 = this.variables.getVariable(v2);
            if(v6 == null) {
            }
            else {
                float v7 = this.variables.getVariableValue(v2);
                int v8 = Float.compare(v7, 0f);
                if(v8 == 0) {
                }
                else {
                    String v6_1 = v6.toString();
                    float v9 = -1f;
                    if(v1_1 == 0) {
                        if(v7 < 0f) {
                            v0 = v0 + "- ";
                            v7 *= v9;
                        }
                    }
                    else if(v8 > 0) {
                        v0 = v0 + " + ";
                    }
                    else {
                        v0 = v0 + " - ";
                        v7 *= v9;
                    }

                    v0 = v7 == 1f ? v0 + v6_1 : v0 + v7 + " " + v6_1;
                    v1_1 = 1;
                }
            }

            ++v2;
        }

        if(v1_1 == 0) {
            v0 = v0 + "0.0";
        }

        return v0;
    }

    public String toString() {
        return this.toReadableString();
    }
}

