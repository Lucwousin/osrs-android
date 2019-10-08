package androidx.constraintlayout.solver;

public class GoalRow extends ArrayRow {
    public GoalRow(Cache arg1) {
        super(arg1);
    }

    public void addError(SolverVariable arg2) {
        super.addError(arg2);
        --arg2.usageInRowCount;
    }
}

