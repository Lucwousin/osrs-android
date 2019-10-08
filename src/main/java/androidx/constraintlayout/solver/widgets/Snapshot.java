package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

public class Snapshot {
    class Connection {
        private ConstraintAnchor mAnchor;
        private int mCreator;
        private int mMargin;
        private Strength mStrengh;
        private ConstraintAnchor mTarget;

        public Connection(ConstraintAnchor arg2) {
            super();
            this.mAnchor = arg2;
            this.mTarget = arg2.getTarget();
            this.mMargin = arg2.getMargin();
            this.mStrengh = arg2.getStrength();
            this.mCreator = arg2.getConnectionCreator();
        }

        public void applyTo(ConstraintWidget arg5) {
            arg5.getAnchor(this.mAnchor.getType()).connect(this.mTarget, this.mMargin, this.mStrengh, this.mCreator);
        }

        public void updateFrom(ConstraintWidget arg2) {
            this.mAnchor = arg2.getAnchor(this.mAnchor.getType());
            if(this.mAnchor != null) {
                this.mTarget = this.mAnchor.getTarget();
                this.mMargin = this.mAnchor.getMargin();
                this.mStrengh = this.mAnchor.getStrength();
                this.mCreator = this.mAnchor.getConnectionCreator();
            }
            else {
                this.mTarget = null;
                this.mMargin = 0;
                this.mStrengh = Strength.STRONG;
                this.mCreator = 0;
            }
        }
    }

    private ArrayList mConnections;
    private int mHeight;
    private int mWidth;
    private int mX;
    private int mY;

    public Snapshot(ConstraintWidget arg6) {
        super();
        this.mConnections = new ArrayList();
        this.mX = arg6.getX();
        this.mY = arg6.getY();
        this.mWidth = arg6.getWidth();
        this.mHeight = arg6.getHeight();
        ArrayList v6 = arg6.getAnchors();
        int v0 = v6.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mConnections.add(new Connection(v6.get(v1)));
        }
    }

    public void applyTo(ConstraintWidget arg4) {
        arg4.setX(this.mX);
        arg4.setY(this.mY);
        arg4.setWidth(this.mWidth);
        arg4.setHeight(this.mHeight);
        int v0 = this.mConnections.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mConnections.get(v1).applyTo(arg4);
        }
    }

    public void updateFrom(ConstraintWidget arg4) {
        this.mX = arg4.getX();
        this.mY = arg4.getY();
        this.mWidth = arg4.getWidth();
        this.mHeight = arg4.getHeight();
        int v0 = this.mConnections.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mConnections.get(v1).updateFrom(arg4);
        }
    }
}

