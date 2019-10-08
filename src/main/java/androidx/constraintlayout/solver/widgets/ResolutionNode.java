package androidx.constraintlayout.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

public class ResolutionNode {
    public static final int REMOVED = 2;
    public static final int RESOLVED = 1;
    public static final int UNRESOLVED;
    HashSet dependents;
    int state;

    public ResolutionNode() {
        super();
        this.dependents = new HashSet(2);
        this.state = 0;
    }

    public void addDependent(ResolutionNode arg2) {
        this.dependents.add(arg2);
    }

    public void didResolve() {
        this.state = 1;
        Iterator v0 = this.dependents.iterator();
        while(v0.hasNext()) {
            v0.next().resolve();
        }
    }

    public void invalidate() {
        this.state = 0;
        Iterator v0 = this.dependents.iterator();
        while(v0.hasNext()) {
            v0.next().invalidate();
        }
    }

    public void invalidateAnchors() {
        if((this instanceof ResolutionAnchor)) {
            this.state = 0;
        }

        Iterator v0 = this.dependents.iterator();
        while(v0.hasNext()) {
            v0.next().invalidateAnchors();
        }
    }

    public boolean isResolved() {
        boolean v1 = true;
        if(this.state == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public void remove(ResolutionDimension arg1) {
    }

    public void reset() {
        this.state = 0;
        this.dependents.clear();
    }

    public void resolve() {
    }
}

