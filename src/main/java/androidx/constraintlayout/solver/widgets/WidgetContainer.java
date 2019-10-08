package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import java.util.ArrayList;

public class WidgetContainer extends ConstraintWidget {
    protected ArrayList mChildren;

    public WidgetContainer() {
        super();
        this.mChildren = new ArrayList();
    }

    public WidgetContainer(int arg1, int arg2) {
        super(arg1, arg2);
        this.mChildren = new ArrayList();
    }

    public WidgetContainer(int arg1, int arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3, arg4);
        this.mChildren = new ArrayList();
    }

    public void add(ConstraintWidget arg2) {
        this.mChildren.add(arg2);
        if(arg2.getParent() != null) {
            arg2.getParent().remove(arg2);
        }

        arg2.setParent(((ConstraintWidget)this));
    }

    public ConstraintWidget findWidget(float arg9, float arg10) {
        WidgetContainer v0_1;
        int v0 = this.getDrawX();
        int v1 = this.getDrawY();
        int v2 = this.getWidth() + v0;
        int v3 = this.getHeight() + v1;
        if(arg9 < (((float)v0)) || arg9 > (((float)v2)) || arg10 < (((float)v1)) || arg10 > (((float)v3))) {
            ConstraintWidget v0_2 = null;
        }
        else {
            v0_1 = this;
        }

        v1 = 0;
        v2 = this.mChildren.size();
        while(v1 < v2) {
            Object v3_1 = this.mChildren.get(v1);
            if((v3_1 instanceof WidgetContainer)) {
                ConstraintWidget v3_2 = ((WidgetContainer)v3_1).findWidget(arg9, arg10);
                if(v3_2 != null) {
                    goto label_42;
                }
            }
            else {
                int v4 = ((ConstraintWidget)v3_1).getDrawX();
                int v5 = ((ConstraintWidget)v3_1).getDrawY();
                int v6 = ((ConstraintWidget)v3_1).getWidth() + v4;
                int v7 = ((ConstraintWidget)v3_1).getHeight() + v5;
                if(arg9 >= (((float)v4)) && arg9 <= (((float)v6)) && arg10 >= (((float)v5)) && arg10 <= (((float)v7))) {
                label_42:
                    Object v0_3 = v3_1;
                }
            }

            ++v1;
        }

        return ((ConstraintWidget)v0_1);
    }

    public ArrayList findWidgets(int arg7, int arg8, int arg9, int arg10) {
        ArrayList v0 = new ArrayList();
        Rectangle v1 = new Rectangle();
        v1.setBounds(arg7, arg8, arg9, arg10);
        arg7 = this.mChildren.size();
        for(arg8 = 0; arg8 < arg7; ++arg8) {
            Object v9 = this.mChildren.get(arg8);
            Rectangle v10 = new Rectangle();
            v10.setBounds(((ConstraintWidget)v9).getDrawX(), ((ConstraintWidget)v9).getDrawY(), ((ConstraintWidget)v9).getWidth(), ((ConstraintWidget)v9).getHeight());
            if(v1.intersects(v10)) {
                v0.add(v9);
            }
        }

        return v0;
    }

    public static Rectangle getBounds(ArrayList arg9) {
        Rectangle v0 = new Rectangle();
        if(arg9.size() == 0) {
            return v0;
        }

        int v1 = arg9.size();
        int v2 = 0x7FFFFFFF;
        int v3 = 0;
        int v4 = 0x7FFFFFFF;
        int v5 = 0;
        int v6 = 0;
        while(v3 < v1) {
            Object v7 = arg9.get(v3);
            if(((ConstraintWidget)v7).getX() < v2) {
                v2 = ((ConstraintWidget)v7).getX();
            }

            if(((ConstraintWidget)v7).getY() < v4) {
                v4 = ((ConstraintWidget)v7).getY();
            }

            if(((ConstraintWidget)v7).getRight() > v5) {
                v5 = ((ConstraintWidget)v7).getRight();
            }

            if(((ConstraintWidget)v7).getBottom() > v6) {
                v6 = ((ConstraintWidget)v7).getBottom();
            }

            ++v3;
        }

        v0.setBounds(v2, v4, v5 - v2, v6 - v4);
        return v0;
    }

    public ArrayList getChildren() {
        return this.mChildren;
    }

    public ConstraintWidgetContainer getRootConstraintContainer() {
        ConstraintWidget v1_2;
        ConstraintWidget v0 = ((ConstraintWidget)this).getParent();
        if((this instanceof ConstraintWidgetContainer)) {
            WidgetContainer v1 = this;
        }
        else {
            ConstraintWidgetContainer v1_1 = null;
        }

        while(v0 != null) {
            ConstraintWidget v2 = v0.getParent();
            if((v0 instanceof ConstraintWidgetContainer)) {
                v1_2 = v0;
            }

            v0 = v2;
        }

        return ((ConstraintWidgetContainer)v1_2);
    }

    public void layout() {
        this.updateDrawPosition();
        if(this.mChildren == null) {
            return;
        }

        int v0 = this.mChildren.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = this.mChildren.get(v1);
            if((v2 instanceof WidgetContainer)) {
                ((WidgetContainer)v2).layout();
            }
        }
    }

    public void remove(ConstraintWidget arg2) {
        this.mChildren.remove(arg2);
        arg2.setParent(null);
    }

    public void removeAllChildren() {
        this.mChildren.clear();
    }

    public void reset() {
        this.mChildren.clear();
        super.reset();
    }

    public void resetSolverVariables(Cache arg4) {
        super.resetSolverVariables(arg4);
        int v0 = this.mChildren.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mChildren.get(v1).resetSolverVariables(arg4);
        }
    }

    public void setOffset(int arg4, int arg5) {
        super.setOffset(arg4, arg5);
        arg4 = this.mChildren.size();
        for(arg5 = 0; arg5 < arg4; ++arg5) {
            this.mChildren.get(arg5).setOffset(this.getRootX(), this.getRootY());
        }
    }

    public void updateDrawPosition() {
        super.updateDrawPosition();
        if(this.mChildren == null) {
            return;
        }

        int v0 = this.mChildren.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = this.mChildren.get(v1);
            ((ConstraintWidget)v2).setOffset(this.getDrawX(), this.getDrawY());
            if(!(v2 instanceof ConstraintWidgetContainer)) {
                ((ConstraintWidget)v2).updateDrawPosition();
            }
        }
    }
}

