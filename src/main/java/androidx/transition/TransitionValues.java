package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TransitionValues {
    final ArrayList mTargetedTransitions;
    public final Map values;
    public View view;

    public TransitionValues() {
        super();
        this.values = new HashMap();
        this.mTargetedTransitions = new ArrayList();
    }

    public boolean equals(Object arg3) {
        if(((arg3 instanceof TransitionValues)) && this.view == ((TransitionValues)arg3).view && (this.values.equals(((TransitionValues)arg3).values))) {
            return 1;
        }

        return 0;
    }

    public int hashCode() {
        return this.view.hashCode() * 0x1F + this.values.hashCode();
    }

    public String toString() {
        String v0_1 = "TransitionValues@" + Integer.toHexString(this.hashCode()) + ":\n";
        v0_1 = v0_1 + "    view = " + this.view + "\n";
        v0_1 = v0_1 + "    values:";
        Iterator v1_1 = this.values.keySet().iterator();
        while(v1_1.hasNext()) {
            Object v2 = v1_1.next();
            v0_1 = v0_1 + "    " + (((String)v2)) + ": " + this.values.get(v2) + "\n";
        }

        return v0_1;
    }
}

