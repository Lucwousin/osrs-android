package androidx.constraintlayout.solver;

import java.io.PrintStream;
import java.util.Arrays;

public class ArrayLinkedVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    private static final int NONE = -1;
    private int ROW_SIZE;
    private SolverVariable candidate;
    int currentSize;
    private int[] mArrayIndices;
    private int[] mArrayNextIndices;
    private float[] mArrayValues;
    private final Cache mCache;
    private boolean mDidFillOnce;
    private int mHead;
    private int mLast;
    private final ArrayRow mRow;

    ArrayLinkedVariables(ArrayRow arg3, Cache arg4) {
        super();
        this.currentSize = 0;
        this.ROW_SIZE = 8;
        this.candidate = null;
        this.mArrayIndices = new int[this.ROW_SIZE];
        this.mArrayNextIndices = new int[this.ROW_SIZE];
        this.mArrayValues = new float[this.ROW_SIZE];
        this.mHead = -1;
        this.mLast = -1;
        this.mDidFillOnce = false;
        this.mRow = arg3;
        this.mCache = arg4;
    }

    final void add(SolverVariable arg10, float arg11, boolean arg12) {
        if(arg11 == 0f) {
            return;
        }

        int v3 = -1;
        if(this.mHead == v3) {
            this.mHead = 0;
            this.mArrayValues[this.mHead] = arg11;
            this.mArrayIndices[this.mHead] = arg10.id;
            this.mArrayNextIndices[this.mHead] = v3;
            ++arg10.usageInRowCount;
            arg10.addToRow(this.mRow);
            ++this.currentSize;
            if(!this.mDidFillOnce) {
                ++this.mLast;
                if(this.mLast >= this.mArrayIndices.length) {
                    this.mDidFillOnce = true;
                    this.mLast = this.mArrayIndices.length - 1;
                }
            }

            return;
        }

        int v1 = this.mHead;
        int v5 = 0;
        int v6 = -1;
        while(v1 != v3) {
            if(v5 >= this.currentSize) {
                break;
            }

            if(this.mArrayIndices[v1] == arg10.id) {
                this.mArrayValues[v1] += arg11;
                if(this.mArrayValues[v1] == 0f) {
                    if(v1 == this.mHead) {
                        this.mHead = this.mArrayNextIndices[v1];
                    }
                    else {
                        this.mArrayNextIndices[v6] = this.mArrayNextIndices[v1];
                    }

                    if(arg12) {
                        arg10.removeFromRow(this.mRow);
                    }

                    if(this.mDidFillOnce) {
                        this.mLast = v1;
                    }

                    --arg10.usageInRowCount;
                    --this.currentSize;
                }

                return;
            }
            else {
                if(this.mArrayIndices[v1] < arg10.id) {
                    v6 = v1;
                }

                v1 = this.mArrayNextIndices[v1];
                ++v5;
                continue;
            }

            break;
        }

        int v12 = this.mLast + 1;
        if(this.mDidFillOnce) {
            v12 = this.mArrayIndices[this.mLast] == v3 ? this.mLast : this.mArrayIndices.length;
        }

        if(v12 >= this.mArrayIndices.length && this.currentSize < this.mArrayIndices.length) {
            int v0 = 0;
            while(v0 < this.mArrayIndices.length) {
                if(this.mArrayIndices[v0] == v3) {
                    v12 = v0;
                }
                else {
                    ++v0;
                    continue;
                }

                break;
            }
        }

        if(v12 >= this.mArrayIndices.length) {
            v12 = this.mArrayIndices.length;
            this.ROW_SIZE *= 2;
            this.mDidFillOnce = false;
            this.mLast = v12 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, this.ROW_SIZE);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }

        this.mArrayIndices[v12] = arg10.id;
        this.mArrayValues[v12] = arg11;
        if(v6 != v3) {
            this.mArrayNextIndices[v12] = this.mArrayNextIndices[v6];
            this.mArrayNextIndices[v6] = v12;
        }
        else {
            this.mArrayNextIndices[v12] = this.mHead;
            this.mHead = v12;
        }

        ++arg10.usageInRowCount;
        arg10.addToRow(this.mRow);
        ++this.currentSize;
        if(!this.mDidFillOnce) {
            ++this.mLast;
        }

        if(this.mLast >= this.mArrayIndices.length) {
            this.mDidFillOnce = true;
            this.mLast = this.mArrayIndices.length - 1;
        }
    }

    SolverVariable chooseSubject(LinearSystem arg15) {
        boolean v4_1;
        boolean v1_1;
        int v0 = this.mHead;
        SolverVariable v1 = null;
        int v2 = 0;
        SolverVariable v4 = v1;
        float v5 = 0f;
        boolean v6 = false;
        float v7 = 0f;
        boolean v8 = false;
        while(v0 != -1) {
            if(v2 >= this.currentSize) {
                break;
            }

            float v9 = this.mArrayValues[v0];
            float v10 = 0.001f;
            SolverVariable v11 = this.mCache.mIndexedVariables[this.mArrayIndices[v0]];
            if(v9 < 0f) {
                if(v9 > -0.001f) {
                    this.mArrayValues[v0] = 0f;
                    v11.removeFromRow(this.mRow);
                    goto label_28;
                }
            }
            else if(v9 < v10) {
                this.mArrayValues[v0] = 0f;
                v11.removeFromRow(this.mRow);
            label_28:
                v9 = 0f;
            }

            if(v9 != 0f) {
                if(v11.mType == Type.UNRESTRICTED) {
                    if(v1 == null) {
                        v1_1 = this.isNew(v11, arg15);
                    }
                    else if(v5 > v9) {
                        v1_1 = this.isNew(v11, arg15);
                    }
                    else {
                        goto label_50;
                    }

                    v6 = v1_1;
                    v5 = v9;
                    v1 = v11;
                    goto label_74;
                label_50:
                    if(v6) {
                        goto label_74;
                    }

                    if(!this.isNew(v11, arg15)) {
                        goto label_74;
                    }

                    v5 = v9;
                    v1 = v11;
                    v6 = true;
                }
                else {
                    if(v1 != null) {
                        goto label_74;
                    }

                    if(v9 >= 0f) {
                        goto label_74;
                    }

                    if(v4 == null) {
                        v4_1 = this.isNew(v11, arg15);
                    }
                    else if(v7 > v9) {
                        v4_1 = this.isNew(v11, arg15);
                    }
                    else {
                        goto label_68;
                    }

                    v8 = v4_1;
                    v7 = v9;
                    v4 = v11;
                    goto label_74;
                label_68:
                    if(v8) {
                        goto label_74;
                    }

                    if(!this.isNew(v11, arg15)) {
                        goto label_74;
                    }

                    v7 = v9;
                    v4 = v11;
                    v8 = true;
                }
            }

        label_74:
            v0 = this.mArrayNextIndices[v0];
            ++v2;
        }

        if(v1 != null) {
            return v1;
        }

        return v4;
    }

    public final void clear() {
        int v3;
        int v0 = this.mHead;
        int v2 = 0;
        while(true) {
            v3 = -1;
            if(v0 != v3 && v2 < this.currentSize) {
                SolverVariable v3_1 = this.mCache.mIndexedVariables[this.mArrayIndices[v0]];
                if(v3_1 != null) {
                    v3_1.removeFromRow(this.mRow);
                }

                v0 = this.mArrayNextIndices[v0];
                ++v2;
                continue;
            }

            break;
        }

        this.mHead = v3;
        this.mLast = v3;
        this.mDidFillOnce = false;
        this.currentSize = 0;
    }

    final boolean containsKey(SolverVariable arg7) {
        int v1 = -1;
        if(this.mHead == v1) {
            return 0;
        }

        int v0 = this.mHead;
        int v3 = 0;
        while(v0 != v1) {
            if(v3 >= this.currentSize) {
                return 0;
            }

            if(this.mArrayIndices[v0] == arg7.id) {
                return 1;
            }
            else {
                v0 = this.mArrayNextIndices[v0];
                ++v3;
                continue;
            }

            return 0;
        }

        return 0;
    }

    public void display() {
        int v0 = this.currentSize;
        System.out.print("{ ");
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            SolverVariable v2 = this.getVariable(v1);
            if(v2 == null) {
            }
            else {
                PrintStream v3 = System.out;
                v3.print(v2 + " = " + this.getVariableValue(v1) + " ");
            }
        }

        System.out.println(" }");
    }

    void divideByAmount(float arg5) {
        int v0 = this.mHead;
        int v1;
        for(v1 = 0; v0 != -1; ++v1) {
            if(v1 >= this.currentSize) {
                return;
            }

            this.mArrayValues[v0] /= arg5;
            v0 = this.mArrayNextIndices[v0];
        }
    }

    public final float get(SolverVariable arg5) {
        int v0 = this.mHead;
        int v1 = 0;
        while(v0 != -1) {
            if(v1 >= this.currentSize) {
                return 0;
            }

            if(this.mArrayIndices[v0] == arg5.id) {
                return this.mArrayValues[v0];
            }
            else {
                v0 = this.mArrayNextIndices[v0];
                ++v1;
                continue;
            }

            return 0;
        }

        return 0;
    }

    SolverVariable getPivotCandidate() {
        if(this.candidate == null) {
            int v0 = this.mHead;
            int v1 = 0;
            SolverVariable v2 = null;
            while(v0 != -1) {
                if(v1 >= this.currentSize) {
                    return v2;
                }

                if(this.mArrayValues[v0] < 0f) {
                    SolverVariable v3 = this.mCache.mIndexedVariables[this.mArrayIndices[v0]];
                    if(v2 != null && v2.strength >= v3.strength) {
                        goto label_23;
                    }

                    v2 = v3;
                }

            label_23:
                v0 = this.mArrayNextIndices[v0];
                ++v1;
            }

            return v2;
        }

        return this.candidate;
    }

    SolverVariable getPivotCandidate(boolean[] arg9, SolverVariable arg10) {
        int v0 = this.mHead;
        int v2 = 0;
        SolverVariable v3 = null;
        float v4 = 0f;
        while(v0 != -1) {
            if(v2 >= this.currentSize) {
                return v3;
            }

            if(this.mArrayValues[v0] < 0f) {
                SolverVariable v5 = this.mCache.mIndexedVariables[this.mArrayIndices[v0]];
                if(arg9 != null && (arg9[v5.id])) {
                    goto label_33;
                }

                if(v5 == arg10) {
                    goto label_33;
                }

                if(v5.mType != Type.SLACK && v5.mType != Type.ERROR) {
                    goto label_33;
                }

                float v6 = this.mArrayValues[v0];
                if(v6 >= v4) {
                    goto label_33;
                }

                v3 = v5;
                v4 = v6;
            }

        label_33:
            v0 = this.mArrayNextIndices[v0];
            ++v2;
        }

        return v3;
    }

    final SolverVariable getVariable(int arg4) {
        int v0 = this.mHead;
        int v1 = 0;
        while(v0 != -1) {
            if(v1 >= this.currentSize) {
                return null;
            }

            if(v1 == arg4) {
                return this.mCache.mIndexedVariables[this.mArrayIndices[v0]];
            }
            else {
                v0 = this.mArrayNextIndices[v0];
                ++v1;
                continue;
            }

            return null;
        }

        return null;
    }

    final float getVariableValue(int arg4) {
        int v0 = this.mHead;
        int v1 = 0;
        while(v0 != -1) {
            if(v1 >= this.currentSize) {
                return 0;
            }

            if(v1 == arg4) {
                return this.mArrayValues[v0];
            }
            else {
                v0 = this.mArrayNextIndices[v0];
                ++v1;
                continue;
            }

            return 0;
        }

        return 0;
    }

    boolean hasAtLeastOnePositiveVariable() {
        int v0 = this.mHead;
        int v2 = 0;
        while(v0 != -1) {
            if(v2 >= this.currentSize) {
                return 0;
            }

            if(this.mArrayValues[v0] > 0f) {
                return 1;
            }
            else {
                v0 = this.mArrayNextIndices[v0];
                ++v2;
                continue;
            }

            return 0;
        }

        return 0;
    }

    void invert() {
        int v0 = this.mHead;
        int v1;
        for(v1 = 0; v0 != -1; ++v1) {
            if(v1 >= this.currentSize) {
                return;
            }

            this.mArrayValues[v0] *= -1f;
            v0 = this.mArrayNextIndices[v0];
        }
    }

    private boolean isNew(SolverVariable arg1, LinearSystem arg2) {
        boolean v2 = true;
        if(arg1.usageInRowCount <= 1) {
        }
        else {
            v2 = false;
        }

        return v2;
    }

    public final void put(SolverVariable arg9, float arg10) {
        if(arg10 == 0f) {
            this.remove(arg9, true);
            return;
        }

        int v3 = -1;
        if(this.mHead == v3) {
            this.mHead = 0;
            this.mArrayValues[this.mHead] = arg10;
            this.mArrayIndices[this.mHead] = arg9.id;
            this.mArrayNextIndices[this.mHead] = v3;
            ++arg9.usageInRowCount;
            arg9.addToRow(this.mRow);
            ++this.currentSize;
            if(!this.mDidFillOnce) {
                ++this.mLast;
                if(this.mLast >= this.mArrayIndices.length) {
                    this.mDidFillOnce = true;
                    this.mLast = this.mArrayIndices.length - 1;
                }
            }

            return;
        }

        int v1 = this.mHead;
        int v4 = 0;
        int v5 = -1;
        while(v1 != v3) {
            if(v4 >= this.currentSize) {
                break;
            }

            if(this.mArrayIndices[v1] == arg9.id) {
                this.mArrayValues[v1] = arg10;
                return;
            }
            else {
                if(this.mArrayIndices[v1] < arg9.id) {
                    v5 = v1;
                }

                v1 = this.mArrayNextIndices[v1];
                ++v4;
                continue;
            }

            break;
        }

        v1 = this.mLast + 1;
        if(this.mDidFillOnce) {
            v1 = this.mArrayIndices[this.mLast] == v3 ? this.mLast : this.mArrayIndices.length;
        }

        if(v1 >= this.mArrayIndices.length && this.currentSize < this.mArrayIndices.length) {
            v4 = 0;
            while(v4 < this.mArrayIndices.length) {
                if(this.mArrayIndices[v4] == v3) {
                    v1 = v4;
                }
                else {
                    ++v4;
                    continue;
                }

                break;
            }
        }

        if(v1 >= this.mArrayIndices.length) {
            v1 = this.mArrayIndices.length;
            this.ROW_SIZE *= 2;
            this.mDidFillOnce = false;
            this.mLast = v1 - 1;
            this.mArrayValues = Arrays.copyOf(this.mArrayValues, this.ROW_SIZE);
            this.mArrayIndices = Arrays.copyOf(this.mArrayIndices, this.ROW_SIZE);
            this.mArrayNextIndices = Arrays.copyOf(this.mArrayNextIndices, this.ROW_SIZE);
        }

        this.mArrayIndices[v1] = arg9.id;
        this.mArrayValues[v1] = arg10;
        if(v5 != v3) {
            this.mArrayNextIndices[v1] = this.mArrayNextIndices[v5];
            this.mArrayNextIndices[v5] = v1;
        }
        else {
            this.mArrayNextIndices[v1] = this.mHead;
            this.mHead = v1;
        }

        ++arg9.usageInRowCount;
        arg9.addToRow(this.mRow);
        ++this.currentSize;
        if(!this.mDidFillOnce) {
            ++this.mLast;
        }

        if(this.currentSize >= this.mArrayIndices.length) {
            this.mDidFillOnce = true;
        }

        if(this.mLast >= this.mArrayIndices.length) {
            this.mDidFillOnce = true;
            this.mLast = this.mArrayIndices.length - 1;
        }
    }

    public final float remove(SolverVariable arg9, boolean arg10) {
        if(this.candidate == arg9) {
            this.candidate = null;
        }

        int v2 = -1;
        if(this.mHead == v2) {
            return 0;
        }

        int v0 = this.mHead;
        int v3 = 0;
        int v4 = -1;
        while(v0 != v2) {
            if(v3 >= this.currentSize) {
                return 0;
            }

            if(this.mArrayIndices[v0] == arg9.id) {
                if(v0 == this.mHead) {
                    this.mHead = this.mArrayNextIndices[v0];
                }
                else {
                    this.mArrayNextIndices[v4] = this.mArrayNextIndices[v0];
                }

                if(arg10) {
                    arg9.removeFromRow(this.mRow);
                }

                --arg9.usageInRowCount;
                --this.currentSize;
                this.mArrayIndices[v0] = v2;
                if(this.mDidFillOnce) {
                    this.mLast = v0;
                }

                return this.mArrayValues[v0];
            }
            else {
                ++v3;
                v4 = v0;
                v0 = this.mArrayNextIndices[v0];
                continue;
            }

            return 0;
        }

        return 0;
    }

    int sizeInBytes() {
        return this.mArrayIndices.length * 4 * 3 + 36;
    }

    public String toString() {
        String v0 = "";
        int v1 = this.mHead;
        int v2;
        for(v2 = 0; v1 != -1; ++v2) {
            if(v2 >= this.currentSize) {
                return v0;
            }

            v0 = v0 + " -> ";
            v0 = v0 + this.mArrayValues[v1] + " : ";
            v0 = v0 + this.mCache.mIndexedVariables[this.mArrayIndices[v1]];
            v1 = this.mArrayNextIndices[v1];
        }

        return v0;
    }

    final void updateFromRow(ArrayRow arg9, ArrayRow arg10, boolean arg11) {
        int v5;
        int v4;
        ArrayLinkedVariables v2_1;
        float v0_1;
        int v0;
        for(v0 = this.mHead; true; v0 = this.mHead) {
            int v2 = 0;
            while(true) {
                int v3 = -1;
                if(v0 != v3 && v2 < this.currentSize) {
                    if(this.mArrayIndices[v0] == arg10.variable.id) {
                        v0_1 = this.mArrayValues[v0];
                        this.remove(arg10.variable, arg11);
                        v2_1 = arg10.variables;
                        v4 = v2_1.mHead;
                        v5 = 0;
                        goto label_19;
                    }
                    else {
                        v0 = this.mArrayNextIndices[v0];
                        ++v2;
                        continue;
                    }
                }

                return;
            }

            return;
        label_19:
            while(v4 != v3) {
                if(v5 >= v2_1.currentSize) {
                    break;
                }

                this.add(this.mCache.mIndexedVariables[v2_1.mArrayIndices[v4]], v2_1.mArrayValues[v4] * v0_1, arg11);
                v4 = v2_1.mArrayNextIndices[v4];
                ++v5;
            }

            arg9.constantValue += arg10.constantValue * v0_1;
            if(arg11) {
                arg10.variable.removeFromRow(arg9);
            }
        }
    }

    void updateFromSystem(ArrayRow arg11, ArrayRow[] arg12) {
        int v7;
        int v6;
        ArrayLinkedVariables v5;
        ArrayRow v4_1;
        float v0_1;
        int v0;
        for(v0 = this.mHead; true; v0 = this.mHead) {
            int v2 = 0;
            while(true) {
                int v3 = -1;
                if(v0 != v3 && v2 < this.currentSize) {
                    SolverVariable v4 = this.mCache.mIndexedVariables[this.mArrayIndices[v0]];
                    if(v4.definitionId != v3) {
                        v0_1 = this.mArrayValues[v0];
                        this.remove(v4, true);
                        v4_1 = arg12[v4.definitionId];
                        if(!v4_1.isSimpleDefinition) {
                            v5 = v4_1.variables;
                            v6 = v5.mHead;
                            v7 = 0;
                            goto label_25;
                        }

                        goto label_41;
                    }
                    else {
                        v0 = this.mArrayNextIndices[v0];
                        ++v2;
                        continue;
                    }
                }

                return;
            }

            return;
        label_25:
            while(v6 != v3) {
                if(v7 >= v5.currentSize) {
                    break;
                }

                this.add(this.mCache.mIndexedVariables[v5.mArrayIndices[v6]], v5.mArrayValues[v6] * v0_1, true);
                v6 = v5.mArrayNextIndices[v6];
                ++v7;
            }

        label_41:
            arg11.constantValue += v4_1.constantValue * v0_1;
            v4_1.variable.removeFromRow(arg11);
        }
    }
}

