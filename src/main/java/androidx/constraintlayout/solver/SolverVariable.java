package androidx.constraintlayout.solver;

import java.util.Arrays;

public class SolverVariable {
    class androidx.constraintlayout.solver.SolverVariable$1 {
        static {
            androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type = new int[Type.values().length];
            try {
                androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.UNRESTRICTED.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.CONSTANT.ordinal()] = 2;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                    try {
                    label_14:
                        androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.SLACK.ordinal()] = 3;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                        try {
                        label_19:
                            androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.ERROR.ordinal()] = 4;
                            goto label_24;
                        }
                        catch(NoSuchFieldError ) {
                            try {
                            label_24:
                                androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[Type.UNKNOWN.ordinal()] = 5;
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

    public enum Type {
        public static final enum Type CONSTANT;
        public static final enum Type ERROR;
        public static final enum Type SLACK;
        public static final enum Type UNKNOWN;
        public static final enum Type UNRESTRICTED;

        static {
            Type.UNRESTRICTED = new Type("UNRESTRICTED", 0);
            Type.CONSTANT = new Type("CONSTANT", 1);
            Type.SLACK = new Type("SLACK", 2);
            Type.ERROR = new Type("ERROR", 3);
            Type.UNKNOWN = new Type("UNKNOWN", 4);
            Type.$VALUES = new Type[]{Type.UNRESTRICTED, Type.CONSTANT, Type.SLACK, Type.ERROR, Type.UNKNOWN};
        }

        private Type(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static Type valueOf(String arg1) {
            return Enum.valueOf(Type.class, arg1);
        }

        public static Type[] values() {
            return Type.$VALUES.clone();
        }
    }

    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 7;
    public static final int STRENGTH_BARRIER = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 6;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    public float computedValue;
    int definitionId;
    public int id;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    private String mName;
    Type mType;
    public int strength;
    float[] strengthVector;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public int usageInRowCount;

    static {
    }

    public SolverVariable(Type arg2, String arg3) {
        super();
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mType = arg2;
    }

    public SolverVariable(String arg3, Type arg4) {
        super();
        this.id = -1;
        this.definitionId = -1;
        this.strength = 0;
        this.strengthVector = new float[7];
        this.mClientEquations = new ArrayRow[8];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mName = arg3;
        this.mType = arg4;
    }

    public final void addToRow(ArrayRow arg3) {
        int v0;
        for(v0 = 0; v0 < this.mClientEquationsCount; ++v0) {
            if(this.mClientEquations[v0] == arg3) {
                return;
            }
        }

        if(this.mClientEquationsCount >= this.mClientEquations.length) {
            this.mClientEquations = Arrays.copyOf(this.mClientEquations, this.mClientEquations.length * 2);
        }

        this.mClientEquations[this.mClientEquationsCount] = arg3;
        ++this.mClientEquationsCount;
    }

    void clearStrengths() {
        int v0;
        for(v0 = 0; v0 < 7; ++v0) {
            this.strengthVector[v0] = 0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    private static String getUniqueName(Type arg1, String arg2) {
        if(arg2 != null) {
            return arg2 + SolverVariable.uniqueErrorId;
        }

        switch(androidx.constraintlayout.solver.SolverVariable$1.$SwitchMap$androidx$constraintlayout$solver$SolverVariable$Type[arg1.ordinal()]) {
            case 1: {
                goto label_56;
            }
            case 2: {
                goto label_46;
            }
            case 3: {
                goto label_36;
            }
            case 4: {
                goto label_26;
            }
            case 5: {
                goto label_16;
            }
        }

        throw new AssertionError(arg1.name());
    label_36:
        v1 = new StringBuilder();
        v1.append("S");
        int v2 = SolverVariable.uniqueSlackId + 1;
        SolverVariable.uniqueSlackId = v2;
        v1.append(v2);
        return v1.toString();
    label_56:
        v1 = new StringBuilder();
        v1.append("U");
        v2 = SolverVariable.uniqueUnrestrictedId + 1;
        SolverVariable.uniqueUnrestrictedId = v2;
        v1.append(v2);
        return v1.toString();
    label_26:
        v1 = new StringBuilder();
        v1.append("e");
        v2 = SolverVariable.uniqueErrorId + 1;
        SolverVariable.uniqueErrorId = v2;
        v1.append(v2);
        return v1.toString();
    label_46:
        v1 = new StringBuilder();
        v1.append("C");
        v2 = SolverVariable.uniqueConstantId + 1;
        SolverVariable.uniqueConstantId = v2;
        v1.append(v2);
        return v1.toString();
    label_16:
        v1 = new StringBuilder();
        v1.append("V");
        v2 = SolverVariable.uniqueId + 1;
        SolverVariable.uniqueId = v2;
        v1.append(v2);
        return v1.toString();
    }

    static void increaseErrorId() {
        ++SolverVariable.uniqueErrorId;
    }

    public final void removeFromRow(ArrayRow arg7) {
        int v0 = this.mClientEquationsCount;
        int v1 = 0;
        int v2 = 0;
        while(v2 < v0) {
            if(this.mClientEquations[v2] != arg7) {
                ++v2;
                continue;
            }

            goto label_7;
        }

        return;
    label_7:
        while(v1 < v0 - v2 - 1) {
            int v3 = v2 + v1;
            this.mClientEquations[v3] = this.mClientEquations[v3 + 1];
            ++v1;
        }

        --this.mClientEquationsCount;
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.definitionId = -1;
        this.computedValue = 0f;
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
    }

    public void setName(String arg1) {
        this.mName = arg1;
    }

    public void setType(Type arg1, String arg2) {
        this.mType = arg1;
    }

    String strengthsToString() {
        String v3 = this + "[";
        int v0_1 = 0;
        int v4 = 0;
        int v5 = 1;
        while(v0_1 < this.strengthVector.length) {
            v3 = v3 + this.strengthVector[v0_1];
            if(this.strengthVector[v0_1] > 0f) {
                v4 = 0;
            }
            else if(this.strengthVector[v0_1] < 0f) {
                v4 = 1;
            }

            if(this.strengthVector[v0_1] != 0f) {
                v5 = 0;
            }

            v3 = v0_1 < this.strengthVector.length - 1 ? v3 + ", " : v3 + "] ";
            ++v0_1;
        }

        if(v4 != 0) {
            v3 = v3 + " (-)";
        }

        if(v5 != 0) {
            v3 = v3 + " (*)";
        }

        return v3;
    }

    public String toString() {
        return "" + this.mName;
    }

    public final void updateReferencesWithNewDefinition(ArrayRow arg6) {
        int v0 = this.mClientEquationsCount;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            this.mClientEquations[v2].variables.updateFromRow(this.mClientEquations[v2], arg6, false);
        }

        this.mClientEquationsCount = 0;
    }
}

