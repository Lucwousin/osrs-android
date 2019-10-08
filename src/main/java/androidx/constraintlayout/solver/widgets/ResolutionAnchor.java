package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;

public class ResolutionAnchor extends ResolutionNode {
    public static final int BARRIER_CONNECTION = 5;
    public static final int CENTER_CONNECTION = 2;
    public static final int CHAIN_CONNECTION = 4;
    public static final int DIRECT_CONNECTION = 1;
    public static final int MATCH_CONNECTION = 3;
    public static final int UNCONNECTED;
    float computedValue;
    private ResolutionDimension dimension;
    private int dimensionMultiplier;
    ConstraintAnchor myAnchor;
    float offset;
    private ResolutionAnchor opposite;
    private ResolutionDimension oppositeDimension;
    private int oppositeDimensionMultiplier;
    private float oppositeOffset;
    float resolvedOffset;
    ResolutionAnchor resolvedTarget;
    ResolutionAnchor target;
    int type;

    public ResolutionAnchor(ConstraintAnchor arg3) {
        super();
        this.type = 0;
        this.dimension = null;
        this.dimensionMultiplier = 1;
        this.oppositeDimension = null;
        this.oppositeDimensionMultiplier = 1;
        this.myAnchor = arg3;
    }

    void addResolvedValue(LinearSystem arg5) {
        SolverVariable v0 = this.myAnchor.getSolverVariable();
        if(this.resolvedTarget == null) {
            arg5.addEquality(v0, ((int)this.resolvedOffset));
        }
        else {
            arg5.addEquality(v0, arg5.createObjectVariable(this.resolvedTarget.myAnchor), ((int)this.resolvedOffset), 6);
        }
    }

    public void dependsOn(ResolutionAnchor arg1, int arg2, ResolutionDimension arg3) {
        this.target = arg1;
        this.target.addDependent(((ResolutionNode)this));
        this.dimension = arg3;
        this.dimensionMultiplier = arg2;
        this.dimension.addDependent(((ResolutionNode)this));
    }

    public void dependsOn(ResolutionAnchor arg1, int arg2) {
        this.target = arg1;
        this.offset = ((float)arg2);
        this.target.addDependent(((ResolutionNode)this));
    }

    public void dependsOn(int arg1, ResolutionAnchor arg2, int arg3) {
        this.type = arg1;
        this.target = arg2;
        this.offset = ((float)arg3);
        this.target.addDependent(((ResolutionNode)this));
    }

    public float getResolvedValue() {
        return this.resolvedOffset;
    }

    public void remove(ResolutionDimension arg3) {
        ResolutionDimension v1 = null;
        if(this.dimension == arg3) {
            this.dimension = v1;
            this.offset = ((float)this.dimensionMultiplier);
        }
        else if(this.dimension == this.oppositeDimension) {
            this.oppositeDimension = v1;
            this.oppositeOffset = ((float)this.oppositeDimensionMultiplier);
        }

        this.resolve();
    }

    public void reset() {
        super.reset();
        this.target = null;
        this.offset = 0f;
        this.dimension = null;
        this.dimensionMultiplier = 1;
        this.oppositeDimension = null;
        this.oppositeDimensionMultiplier = 1;
        this.resolvedTarget = null;
        this.resolvedOffset = 0f;
        this.computedValue = 0f;
        this.opposite = null;
        this.oppositeOffset = 0f;
        this.type = 0;
    }

    public void resolve(ResolutionAnchor arg2, float arg3) {
        if(this.state == 0 || this.resolvedTarget != arg2 && this.resolvedOffset != arg3) {
            this.resolvedTarget = arg2;
            this.resolvedOffset = arg3;
            if(this.state == 1) {
                this.invalidate();
            }

            this.didResolve();
        }
    }

    public void resolve() {
        float v2;
        Metrics v0;
        int v1 = 1;
        if(this.state == 1) {
            return;
        }

        if(this.type == 4) {
            return;
        }

        if(this.dimension != null) {
            if(this.dimension.state != 1) {
                return;
            }
            else {
                this.offset = (((float)this.dimensionMultiplier)) * this.dimension.value;
            }
        }

        if(this.oppositeDimension != null) {
            if(this.oppositeDimension.state != 1) {
                return;
            }
            else {
                this.oppositeOffset = (((float)this.oppositeDimensionMultiplier)) * this.oppositeDimension.value;
            }
        }

        if(this.type == 1) {
            if(this.target != null && this.target.state != 1) {
                goto label_55;
            }

            if(this.target == null) {
                this.resolvedTarget = this;
                this.resolvedOffset = this.offset;
            }
            else {
                this.resolvedTarget = this.target.resolvedTarget;
                this.resolvedOffset = this.target.resolvedOffset + this.offset;
            }

            this.didResolve();
        }
        else {
        label_55:
            long v3 = 1;
            if(this.type == 2 && this.target != null && this.target.state == 1 && this.opposite != null && this.opposite.target != null && this.opposite.target.state == 1) {
                if(LinearSystem.getMetrics() != null) {
                    v0 = LinearSystem.getMetrics();
                    v0.centerConnectionResolved += v3;
                }

                this.resolvedTarget = this.target.resolvedTarget;
                this.opposite.resolvedTarget = this.opposite.target.resolvedTarget;
                int v3_1 = 0;
                if(this.myAnchor.mType != Type.RIGHT) {
                    if(this.myAnchor.mType == Type.BOTTOM) {
                    }
                    else {
                        v1 = 0;
                    }
                }

                float v0_1 = v1 != 0 ? this.target.resolvedOffset - this.opposite.target.resolvedOffset : this.opposite.target.resolvedOffset - this.target.resolvedOffset;
                if(this.myAnchor.mType == Type.LEFT || this.myAnchor.mType == Type.RIGHT) {
                    v0_1 -= ((float)this.myAnchor.mOwner.getWidth());
                    v2 = this.myAnchor.mOwner.mHorizontalBiasPercent;
                }
                else {
                    v0_1 -= ((float)this.myAnchor.mOwner.getHeight());
                    v2 = this.myAnchor.mOwner.mVerticalBiasPercent;
                }

                int v4 = this.myAnchor.getMargin();
                int v5 = this.opposite.myAnchor.getMargin();
                if(this.myAnchor.getTarget() == this.opposite.myAnchor.getTarget()) {
                    v2 = 0.5f;
                    v5 = 0;
                }
                else {
                    v3_1 = v4;
                }

                float v3_2 = ((float)v3_1);
                float v4_1 = ((float)v5);
                v0_1 = v0_1 - v3_2 - v4_1;
                float v5_1 = 1f;
                if(v1 != 0) {
                    this.opposite.resolvedOffset = this.opposite.target.resolvedOffset + v4_1 + v0_1 * v2;
                    this.resolvedOffset = this.target.resolvedOffset - v3_2 - v0_1 * (v5_1 - v2);
                }
                else {
                    this.resolvedOffset = this.target.resolvedOffset + v3_2 + v0_1 * v2;
                    this.opposite.resolvedOffset = this.opposite.target.resolvedOffset - v4_1 - v0_1 * (v5_1 - v2);
                }

                this.didResolve();
                this.opposite.didResolve();
                return;
            }

            if(this.type == 3 && this.target != null && this.target.state == 1 && this.opposite != null && this.opposite.target != null && this.opposite.target.state == 1) {
                if(LinearSystem.getMetrics() != null) {
                    v0 = LinearSystem.getMetrics();
                    v0.matchConnectionResolved += v3;
                }

                this.resolvedTarget = this.target.resolvedTarget;
                this.opposite.resolvedTarget = this.opposite.target.resolvedTarget;
                this.resolvedOffset = this.target.resolvedOffset + this.offset;
                this.opposite.resolvedOffset = this.opposite.target.resolvedOffset + this.opposite.offset;
                this.didResolve();
                this.opposite.didResolve();
                return;
            }

            if(this.type != 5) {
                return;
            }

            this.myAnchor.mOwner.resolve();
        }
    }

    String sType(int arg2) {
        if(arg2 == 1) {
            return "DIRECT";
        }

        if(arg2 == 2) {
            return "CENTER";
        }

        if(arg2 == 3) {
            return "MATCH";
        }

        if(arg2 == 4) {
            return "CHAIN";
        }

        if(arg2 == 5) {
            return "BARRIER";
        }

        return "UNCONNECTED";
    }

    public void setOpposite(ResolutionAnchor arg1, float arg2) {
        this.opposite = arg1;
        this.oppositeOffset = arg2;
    }

    public void setOpposite(ResolutionAnchor arg1, int arg2, ResolutionDimension arg3) {
        this.opposite = arg1;
        this.oppositeDimension = arg3;
        this.oppositeDimensionMultiplier = arg2;
    }

    public void setType(int arg1) {
        this.type = arg1;
    }

    public String toString() {
        if(this.state == 1) {
            if(this.resolvedTarget == this) {
                return "[" + this.myAnchor + ", RESOLVED: " + this.resolvedOffset + "]  type: " + this.sType(this.type);
            }

            return "[" + this.myAnchor + ", RESOLVED: " + this.resolvedTarget + ":" + this.resolvedOffset + "] type: " + this.sType(this.type);
        }

        return "{ " + this.myAnchor + " UNRESOLVED} type: " + this.sType(this.type);
    }

    public void update() {
        ConstraintAnchor v0 = this.myAnchor.getTarget();
        if(v0 == null) {
            return;
        }

        if(v0.getTarget() == this.myAnchor) {
            this.type = 4;
            v0.getResolutionNode().type = 4;
        }

        int v1 = this.myAnchor.getMargin();
        if(this.myAnchor.mType == Type.RIGHT || this.myAnchor.mType == Type.BOTTOM) {
            v1 = -v1;
        }

        this.dependsOn(v0.getResolutionNode(), v1);
    }
}

