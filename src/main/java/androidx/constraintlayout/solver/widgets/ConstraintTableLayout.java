package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;

public class ConstraintTableLayout extends ConstraintWidgetContainer {
    class HorizontalSlice {
        ConstraintWidget bottom;
        int padding;
        ConstraintWidget top;

        HorizontalSlice(ConstraintTableLayout arg1) {
            ConstraintTableLayout.this = arg1;
            super();
        }
    }

    class VerticalSlice {
        int alignment;
        ConstraintWidget left;
        int padding;
        ConstraintWidget right;

        VerticalSlice(ConstraintTableLayout arg1) {
            ConstraintTableLayout.this = arg1;
            super();
            this.alignment = 1;
        }
    }

    public static final int ALIGN_CENTER = 0;
    private static final int ALIGN_FULL = 3;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    private ArrayList mHorizontalGuidelines;
    private ArrayList mHorizontalSlices;
    private int mNumCols;
    private int mNumRows;
    private int mPadding;
    private boolean mVerticalGrowth;
    private ArrayList mVerticalGuidelines;
    private ArrayList mVerticalSlices;
    private LinearSystem system;

    public ConstraintTableLayout() {
        super();
        this.mVerticalGrowth = true;
        this.mNumCols = 0;
        this.mNumRows = 0;
        this.mPadding = 8;
        this.mVerticalSlices = new ArrayList();
        this.mHorizontalSlices = new ArrayList();
        this.mVerticalGuidelines = new ArrayList();
        this.mHorizontalGuidelines = new ArrayList();
        this.system = null;
    }

    public ConstraintTableLayout(int arg1, int arg2) {
        super(arg1, arg2);
        this.mVerticalGrowth = true;
        this.mNumCols = 0;
        this.mNumRows = 0;
        this.mPadding = 8;
        this.mVerticalSlices = new ArrayList();
        this.mHorizontalSlices = new ArrayList();
        this.mVerticalGuidelines = new ArrayList();
        this.mHorizontalGuidelines = new ArrayList();
        this.system = null;
    }

    public ConstraintTableLayout(int arg1, int arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3, arg4);
        this.mVerticalGrowth = true;
        this.mNumCols = 0;
        this.mNumRows = 0;
        this.mPadding = 8;
        this.mVerticalSlices = new ArrayList();
        this.mHorizontalSlices = new ArrayList();
        this.mVerticalGuidelines = new ArrayList();
        this.mHorizontalGuidelines = new ArrayList();
        this.system = null;
    }

    public void addToSolver(LinearSystem arg9) {
        Object v5;
        super.addToSolver(arg9);
        int v0 = this.mChildren.size();
        if(v0 == 0) {
            return;
        }

        this.setTableDimensions();
        if(arg9 == this.mSystem) {
            int v1 = this.mVerticalGuidelines.size();
            int v2 = 0;
            int v3;
            for(v3 = 0; true; ++v3) {
                boolean v4 = true;
                if(v3 >= v1) {
                    break;
                }

                v5 = this.mVerticalGuidelines.get(v3);
                if(this.getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT) {
                }
                else {
                    v4 = false;
                }

                ((Guideline)v5).setPositionRelaxed(v4);
                ((Guideline)v5).addToSolver(arg9);
            }

            v1 = this.mHorizontalGuidelines.size();
            for(v3 = 0; v3 < v1; ++v3) {
                v5 = this.mHorizontalGuidelines.get(v3);
                boolean v6 = this.getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT ? true : false;
                ((Guideline)v5).setPositionRelaxed(v6);
                ((Guideline)v5).addToSolver(arg9);
            }

            while(v2 < v0) {
                this.mChildren.get(v2).addToSolver(arg9);
                ++v2;
            }
        }
    }

    public void computeGuidelinesPercentPositions() {
        int v0 = this.mVerticalGuidelines.size();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            this.mVerticalGuidelines.get(v2).inferRelativePercentPosition();
        }

        v0 = this.mHorizontalGuidelines.size();
        while(v1 < v0) {
            this.mHorizontalGuidelines.get(v1).inferRelativePercentPosition();
            ++v1;
        }
    }

    public void cycleColumnAlignment(int arg2) {
        Object v2 = this.mVerticalSlices.get(arg2);
        switch(((VerticalSlice)v2).alignment) {
            case 0: {
                ((VerticalSlice)v2).alignment = 2;
                break;
            }
            case 1: {
                ((VerticalSlice)v2).alignment = 0;
                break;
            }
            case 2: {
                ((VerticalSlice)v2).alignment = 1;
                break;
            }
            default: {
                break;
            }
        }

        this.setChildrenConnections();
    }

    public String getColumnAlignmentRepresentation(int arg3) {
        Object v3 = this.mVerticalSlices.get(arg3);
        if(((VerticalSlice)v3).alignment == 1) {
            return "L";
        }

        if(((VerticalSlice)v3).alignment == 0) {
            return "C";
        }

        if(((VerticalSlice)v3).alignment == 3) {
            return "F";
        }

        if(((VerticalSlice)v3).alignment == 2) {
            return "R";
        }

        return "!";
    }

    public String getColumnsAlignmentRepresentation() {
        int v0 = this.mVerticalSlices.size();
        String v1 = "";
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = this.mVerticalSlices.get(v2);
            if(((VerticalSlice)v3).alignment == 1) {
                v1 = v1 + "L";
            }
            else if(((VerticalSlice)v3).alignment == 0) {
                v1 = v1 + "C";
            }
            else if(((VerticalSlice)v3).alignment == 3) {
                v1 = v1 + "F";
            }
            else if(((VerticalSlice)v3).alignment == 2) {
                v1 = v1 + "R";
            }
        }

        return v1;
    }

    public ArrayList getHorizontalGuidelines() {
        return this.mHorizontalGuidelines;
    }

    public int getNumCols() {
        return this.mNumCols;
    }

    public int getNumRows() {
        return this.mNumRows;
    }

    public int getPadding() {
        return this.mPadding;
    }

    public String getType() {
        return "ConstraintTableLayout";
    }

    public ArrayList getVerticalGuidelines() {
        return this.mVerticalGuidelines;
    }

    public boolean handlesInternalConstraints() {
        return 1;
    }

    public boolean isVerticalGrowth() {
        return this.mVerticalGrowth;
    }

    private void setChildrenConnections() {
        int v0 = this.mChildren.size();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            Object v3 = this.mChildren.get(v1);
            v2 += ((ConstraintWidget)v3).getContainerItemSkip();
            int v4 = v2 % this.mNumCols;
            Object v5 = this.mHorizontalSlices.get(v2 / this.mNumCols);
            Object v4_1 = this.mVerticalSlices.get(v4);
            ConstraintWidget v6 = ((VerticalSlice)v4_1).left;
            ConstraintWidget v7 = ((VerticalSlice)v4_1).right;
            ConstraintWidget v8 = ((HorizontalSlice)v5).top;
            ConstraintWidget v5_1 = ((HorizontalSlice)v5).bottom;
            ((ConstraintWidget)v3).getAnchor(Type.LEFT).connect(v6.getAnchor(Type.LEFT), this.mPadding);
            if((v7 instanceof Guideline)) {
                ((ConstraintWidget)v3).getAnchor(Type.RIGHT).connect(v7.getAnchor(Type.LEFT), this.mPadding);
            }
            else {
                ((ConstraintWidget)v3).getAnchor(Type.RIGHT).connect(v7.getAnchor(Type.RIGHT), this.mPadding);
            }

            switch(((VerticalSlice)v4_1).alignment) {
                case 1: {
                    ((ConstraintWidget)v3).getAnchor(Type.LEFT).setStrength(Strength.STRONG);
                    ((ConstraintWidget)v3).getAnchor(Type.RIGHT).setStrength(Strength.WEAK);
                    break;
                }
                case 2: {
                    ((ConstraintWidget)v3).getAnchor(Type.LEFT).setStrength(Strength.WEAK);
                    ((ConstraintWidget)v3).getAnchor(Type.RIGHT).setStrength(Strength.STRONG);
                    break;
                }
                case 3: {
                    ((ConstraintWidget)v3).setHorizontalDimensionBehaviour(DimensionBehaviour.MATCH_CONSTRAINT);
                    break;
                }
                default: {
                    break;
                }
            }

            ((ConstraintWidget)v3).getAnchor(Type.TOP).connect(v8.getAnchor(Type.TOP), this.mPadding);
            if((v5_1 instanceof Guideline)) {
                ((ConstraintWidget)v3).getAnchor(Type.BOTTOM).connect(v5_1.getAnchor(Type.TOP), this.mPadding);
            }
            else {
                ((ConstraintWidget)v3).getAnchor(Type.BOTTOM).connect(v5_1.getAnchor(Type.BOTTOM), this.mPadding);
            }

            ++v2;
            ++v1;
        }
    }

    public void setColumnAlignment(int arg2, int arg3) {
        if(arg2 < this.mVerticalSlices.size()) {
            this.mVerticalSlices.get(arg2).alignment = arg3;
            this.setChildrenConnections();
        }
    }

    public void setColumnAlignment(String arg6) {
        int v0 = arg6.length();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg6.charAt(v2);
            if(v3 == 76) {
                this.setColumnAlignment(v2, 1);
            }
            else if(v3 == 67) {
                this.setColumnAlignment(v2, 0);
            }
            else if(v3 == 70) {
                this.setColumnAlignment(v2, 3);
            }
            else if(v3 == 82) {
                this.setColumnAlignment(v2, 2);
            }
            else {
                this.setColumnAlignment(v2, 0);
            }
        }
    }

    public void setDebugSolverName(LinearSystem arg1, String arg2) {
        this.system = arg1;
        super.setDebugSolverName(arg1, arg2);
        this.updateDebugSolverNames();
    }

    private void setHorizontalSlices() {
        this.mHorizontalSlices.clear();
        float v1 = 100f / (((float)this.mNumRows));
        ConstraintTableLayout v3 = this;
        float v4 = v1;
        int v2;
        for(v2 = 0; v2 < this.mNumRows; ++v2) {
            HorizontalSlice v5 = new HorizontalSlice(this);
            v5.top = ((ConstraintWidget)v3);
            if(v2 < this.mNumRows - 1) {
                Guideline v3_1 = new Guideline();
                v3_1.setOrientation(0);
                v3_1.setParent(((ConstraintWidget)this));
                v3_1.setGuidePercent(((int)v4));
                v4 += v1;
                v5.bottom = ((ConstraintWidget)v3_1);
                this.mHorizontalGuidelines.add(v3_1);
            }
            else {
                v5.bottom = ((ConstraintWidget)this);
            }

            ConstraintWidget v3_2 = v5.bottom;
            this.mHorizontalSlices.add(v5);
        }

        this.updateDebugSolverNames();
    }

    public void setNumCols(int arg2) {
        if((this.mVerticalGrowth) && this.mNumCols != arg2) {
            this.mNumCols = arg2;
            this.setVerticalSlices();
            this.setTableDimensions();
        }
    }

    public void setNumRows(int arg2) {
        if(!this.mVerticalGrowth && this.mNumCols != arg2) {
            this.mNumRows = arg2;
            this.setHorizontalSlices();
            this.setTableDimensions();
        }
    }

    public void setPadding(int arg2) {
        if(arg2 > 1) {
            this.mPadding = arg2;
        }
    }

    public void setTableDimensions() {
        int v0 = this.mChildren.size();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            v2 += this.mChildren.get(v1).getContainerItemSkip();
            ++v1;
        }

        v0 += v2;
        if(this.mVerticalGrowth) {
            if(this.mNumCols == 0) {
                this.setNumCols(1);
            }

            v1 = v0 / this.mNumCols;
            if(this.mNumCols * v1 < v0) {
                ++v1;
            }

            if(this.mNumRows == v1 && this.mVerticalGuidelines.size() == this.mNumCols - 1) {
                return;
            }

            this.mNumRows = v1;
            this.setHorizontalSlices();
        }
        else {
            if(this.mNumRows == 0) {
                this.setNumRows(1);
            }

            v1 = v0 / this.mNumRows;
            if(this.mNumRows * v1 < v0) {
                ++v1;
            }

            if(this.mNumCols == v1 && this.mHorizontalGuidelines.size() == this.mNumRows - 1) {
                return;
            }

            this.mNumCols = v1;
            this.setVerticalSlices();
        }

        this.setChildrenConnections();
    }

    public void setVerticalGrowth(boolean arg1) {
        this.mVerticalGrowth = arg1;
    }

    private void setVerticalSlices() {
        this.mVerticalSlices.clear();
        float v1 = 100f / (((float)this.mNumCols));
        int v0 = 0;
        ConstraintTableLayout v2 = this;
        float v3 = v1;
        while(v0 < this.mNumCols) {
            VerticalSlice v4 = new VerticalSlice(this);
            v4.left = ((ConstraintWidget)v2);
            if(v0 < this.mNumCols - 1) {
                Guideline v2_1 = new Guideline();
                v2_1.setOrientation(1);
                v2_1.setParent(((ConstraintWidget)this));
                v2_1.setGuidePercent(((int)v3));
                v3 += v1;
                v4.right = ((ConstraintWidget)v2_1);
                this.mVerticalGuidelines.add(v2_1);
            }
            else {
                v4.right = ((ConstraintWidget)this);
            }

            ConstraintWidget v2_2 = v4.right;
            this.mVerticalSlices.add(v4);
            ++v0;
        }

        this.updateDebugSolverNames();
    }

    private void updateDebugSolverNames() {
        if(this.system == null) {
            return;
        }

        int v0 = this.mVerticalGuidelines.size();
        int v1 = 0;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = this.mVerticalGuidelines.get(v2);
            LinearSystem v4 = this.system;
            ((Guideline)v3).setDebugSolverName(v4, this.getDebugName() + ".VG" + v2);
        }

        v0 = this.mHorizontalGuidelines.size();
        while(v1 < v0) {
            Object v2_1 = this.mHorizontalGuidelines.get(v1);
            LinearSystem v3_1 = this.system;
            ((Guideline)v2_1).setDebugSolverName(v3_1, this.getDebugName() + ".HG" + v1);
            ++v1;
        }
    }

    public void updateFromSolver(LinearSystem arg5) {
        super.updateFromSolver(arg5);
        if(arg5 == this.mSystem) {
            int v0 = this.mVerticalGuidelines.size();
            int v1 = 0;
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                this.mVerticalGuidelines.get(v2).updateFromSolver(arg5);
            }

            v0 = this.mHorizontalGuidelines.size();
            while(v1 < v0) {
                this.mHorizontalGuidelines.get(v1).updateFromSolver(arg5);
                ++v1;
            }
        }
    }
}

