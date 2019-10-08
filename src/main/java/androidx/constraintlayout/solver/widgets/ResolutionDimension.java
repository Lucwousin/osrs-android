package androidx.constraintlayout.solver.widgets;

public class ResolutionDimension extends ResolutionNode {
    float value;

    public ResolutionDimension() {
        super();
        this.value = 0f;
    }

    public void remove() {
        this.state = 2;
    }

    public void reset() {
        super.reset();
        this.value = 0f;
    }

    public void resolve(int arg3) {
        if(this.state == 0 || this.value != (((float)arg3))) {
            this.value = ((float)arg3);
            if(this.state == 1) {
                this.invalidate();
            }

            this.didResolve();
        }
    }
}

