package androidx.constraintlayout.solver.widgets;

import java.util.Arrays;

public class Helper extends ConstraintWidget {
    protected ConstraintWidget[] mWidgets;
    protected int mWidgetsCount;

    public Helper() {
        super();
        this.mWidgets = new ConstraintWidget[4];
        this.mWidgetsCount = 0;
    }

    public void add(ConstraintWidget arg3) {
        if(this.mWidgetsCount + 1 > this.mWidgets.length) {
            this.mWidgets = Arrays.copyOf(this.mWidgets, this.mWidgets.length * 2);
        }

        this.mWidgets[this.mWidgetsCount] = arg3;
        ++this.mWidgetsCount;
    }

    public void removeAllIds() {
        this.mWidgetsCount = 0;
    }
}

