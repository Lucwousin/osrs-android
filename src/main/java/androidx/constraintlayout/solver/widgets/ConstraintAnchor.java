package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;

public class ConstraintAnchor {
    class androidx.constraintlayout.solver.widgets.ConstraintAnchor$1 {
        static {
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = new int[Type.values().length];
            try {
                androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.LEFT.ordinal()] = 2;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                    try {
                    label_14:
                        androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.RIGHT.ordinal()] = 3;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                        try {
                        label_19:
                            androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.TOP.ordinal()] = 4;
                            goto label_24;
                        }
                        catch(NoSuchFieldError ) {
                            try {
                            label_24:
                                androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.BOTTOM.ordinal()] = 5;
                                goto label_29;
                            }
                            catch(NoSuchFieldError ) {
                                try {
                                label_29:
                                    androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.BASELINE.ordinal()] = 6;
                                    goto label_34;
                                }
                                catch(NoSuchFieldError ) {
                                    try {
                                    label_34:
                                        androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER_X.ordinal()] = 7;
                                        goto label_39;
                                    }
                                    catch(NoSuchFieldError ) {
                                        try {
                                        label_39:
                                            androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER_Y.ordinal()] = 8;
                                            goto label_44;
                                        }
                                        catch(NoSuchFieldError ) {
                                            try {
                                            label_44:
                                                androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.NONE.ordinal()] = 9;
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
                }
            }
        }
    }

    public enum ConnectionType {
        public static final enum ConnectionType RELAXED;
        public static final enum ConnectionType STRICT;

        static {
            ConnectionType.RELAXED = new ConnectionType("RELAXED", 0);
            ConnectionType.STRICT = new ConnectionType("STRICT", 1);
            ConnectionType.$VALUES = new ConnectionType[]{ConnectionType.RELAXED, ConnectionType.STRICT};
        }

        private ConnectionType(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static ConnectionType valueOf(String arg1) {
            return Enum.valueOf(ConnectionType.class, arg1);
        }

        public static ConnectionType[] values() {
            return ConnectionType.$VALUES.clone();
        }
    }

    public enum Strength {
        public static final enum Strength NONE;
        public static final enum Strength STRONG;
        public static final enum Strength WEAK;

        static {
            Strength.NONE = new Strength("NONE", 0);
            Strength.STRONG = new Strength("STRONG", 1);
            Strength.WEAK = new Strength("WEAK", 2);
            Strength.$VALUES = new Strength[]{Strength.NONE, Strength.STRONG, Strength.WEAK};
        }

        private Strength(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static Strength valueOf(String arg1) {
            return Enum.valueOf(Strength.class, arg1);
        }

        public static Strength[] values() {
            return Strength.$VALUES.clone();
        }
    }

    public enum Type {
        public static final enum Type BASELINE;
        public static final enum Type BOTTOM;
        public static final enum Type CENTER;
        public static final enum Type CENTER_X;
        public static final enum Type CENTER_Y;
        public static final enum Type LEFT;
        public static final enum Type NONE;
        public static final enum Type RIGHT;
        public static final enum Type TOP;

        static {
            Type.NONE = new Type("NONE", 0);
            Type.LEFT = new Type("LEFT", 1);
            Type.TOP = new Type("TOP", 2);
            Type.RIGHT = new Type("RIGHT", 3);
            Type.BOTTOM = new Type("BOTTOM", 4);
            Type.BASELINE = new Type("BASELINE", 5);
            Type.CENTER = new Type("CENTER", 6);
            Type.CENTER_X = new Type("CENTER_X", 7);
            Type.CENTER_Y = new Type("CENTER_Y", 8);
            Type.$VALUES = new Type[]{Type.NONE, Type.LEFT, Type.TOP, Type.RIGHT, Type.BOTTOM, Type.BASELINE, Type.CENTER, Type.CENTER_X, Type.CENTER_Y};
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

    private static final boolean ALLOW_BINARY = false;
    public static final int AUTO_CONSTRAINT_CREATOR = 2;
    public static final int SCOUT_CREATOR = 1;
    private static final int UNSET_GONE_MARGIN = -1;
    public static final int USER_CREATOR;
    private int mConnectionCreator;
    private ConnectionType mConnectionType;
    int mGoneMargin;
    public int mMargin;
    final ConstraintWidget mOwner;
    private ResolutionAnchor mResolutionAnchor;
    SolverVariable mSolverVariable;
    private Strength mStrength;
    ConstraintAnchor mTarget;
    final Type mType;

    public ConstraintAnchor(ConstraintWidget arg3, Type arg4) {
        super();
        this.mResolutionAnchor = new ResolutionAnchor(this);
        this.mMargin = 0;
        this.mGoneMargin = -1;
        this.mStrength = Strength.NONE;
        this.mConnectionType = ConnectionType.RELAXED;
        this.mConnectionCreator = 0;
        this.mOwner = arg3;
        this.mType = arg4;
    }

    public boolean connect(ConstraintAnchor arg8, int arg9) {
        return this.connect(arg8, arg9, -1, Strength.STRONG, 0, false);
    }

    public boolean connect(ConstraintAnchor arg3, int arg4, int arg5, Strength arg6, int arg7, boolean arg8) {
        if(arg3 == null) {
            this.mTarget = null;
            this.mMargin = 0;
            this.mGoneMargin = -1;
            this.mStrength = Strength.NONE;
            this.mConnectionCreator = 2;
            return 1;
        }

        if(!arg8 && !this.isValidConnection(arg3)) {
            return 0;
        }

        this.mTarget = arg3;
        this.mMargin = arg4 > 0 ? arg4 : 0;
        this.mGoneMargin = arg5;
        this.mStrength = arg6;
        this.mConnectionCreator = arg7;
        return 1;
    }

    public boolean connect(ConstraintAnchor arg8, int arg9, int arg10) {
        return this.connect(arg8, arg9, -1, Strength.STRONG, arg10, false);
    }

    public boolean connect(ConstraintAnchor arg8, int arg9, Strength arg10, int arg11) {
        return this.connect(arg8, arg9, -1, arg10, arg11, false);
    }

    public int getConnectionCreator() {
        return this.mConnectionCreator;
    }

    public ConnectionType getConnectionType() {
        return this.mConnectionType;
    }

    public int getMargin() {
        int v1 = 8;
        if(this.mOwner.getVisibility() == v1) {
            return 0;
        }

        if(this.mGoneMargin > -1 && this.mTarget != null && this.mTarget.mOwner.getVisibility() == v1) {
            return this.mGoneMargin;
        }

        return this.mMargin;
    }

    public final ConstraintAnchor getOpposite() {
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 2: {
                goto label_19;
            }
            case 3: {
                goto label_16;
            }
            case 4: {
                goto label_13;
            }
            case 5: {
                goto label_10;
            }
            case 1: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return null;
            }
        }

        throw new AssertionError(this.mType.name());
    label_19:
        return this.mOwner.mRight;
    label_10:
        return this.mOwner.mTop;
    label_13:
        return this.mOwner.mBottom;
    label_16:
        return this.mOwner.mLeft;
    }

    public ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public int getPriorityLevel() {
        int v2 = 2;
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1: {
                return v2;
            }
            case 2: {
                return v2;
            }
            case 3: {
                return v2;
            }
            case 4: {
                return v2;
            }
            case 5: {
                return v2;
            }
            case 6: {
                return 1;
            }
            case 7: {
                return 0;
            }
            case 8: {
                return 0;
            }
            case 9: {
                return 0;
            }
        }

        throw new AssertionError(this.mType.name());
        return v2;
    }

    public ResolutionAnchor getResolutionNode() {
        return this.mResolutionAnchor;
    }

    public int getSnapPriorityLevel() {
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1: {
                return 3;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 0;
            }
            case 5: {
                return 0;
            }
            case 6: {
                return 2;
            }
            case 7: {
                return 0;
            }
            case 8: {
                return 1;
            }
            case 9: {
                return 0;
            }
        }

        throw new AssertionError(this.mType.name());
        return 0;
    }

    public SolverVariable getSolverVariable() {
        return this.mSolverVariable;
    }

    public Strength getStrength() {
        return this.mStrength;
    }

    public ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isConnected() {
        boolean v0 = this.mTarget != null ? true : false;
        return v0;
    }

    public boolean isConnectionAllowed(ConstraintWidget arg4) {
        if(this.isConnectionToMe(arg4, new HashSet())) {
            return 0;
        }

        ConstraintWidget v0 = this.getOwner().getParent();
        if(v0 == arg4) {
            return 1;
        }

        if(arg4.getParent() == v0) {
            return 1;
        }

        return 0;
    }

    public boolean isConnectionAllowed(ConstraintWidget arg1, ConstraintAnchor arg2) {
        return this.isConnectionAllowed(arg1);
    }

    private boolean isConnectionToMe(ConstraintWidget arg7, HashSet arg8) {
        if(arg8.contains(arg7)) {
            return 0;
        }

        arg8.add(arg7);
        if(arg7 == this.getOwner()) {
            return 1;
        }

        ArrayList v7 = arg7.getAnchors();
        int v0 = v7.size();
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            Object v4 = v7.get(v3);
            if((((ConstraintAnchor)v4).isSimilarDimensionConnection(this)) && (((ConstraintAnchor)v4).isConnected()) && (this.isConnectionToMe(((ConstraintAnchor)v4).getTarget().getOwner(), arg8))) {
                return 1;
            }
        }

        return 0;
    }

    public boolean isSideAnchor() {
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 1;
            }
            case 1: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return 0;
            }
        }

        throw new AssertionError(this.mType.name());
        return 1;
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor arg4) {
        Type v4 = arg4.getType();
        boolean v1 = true;
        if(v4 == this.mType) {
            return 1;
        }

        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1: {
                goto label_37;
            }
            case 2: 
            case 3: 
            case 7: {
                goto label_28;
            }
            case 4: 
            case 5: 
            case 6: 
            case 8: {
                goto label_17;
            }
            case 9: {
                return 0;
            }
        }

        throw new AssertionError(this.mType.name());
    label_17:
        if(v4 != Type.TOP && v4 != Type.BOTTOM && v4 != Type.CENTER_Y) {
            if(v4 == Type.BASELINE) {
            }
            else {
                v1 = false;
            }
        }

        return v1;
    label_37:
        if(v4 != Type.BASELINE) {
        }
        else {
            v1 = false;
        }

        return v1;
    label_28:
        if(v4 != Type.LEFT && v4 != Type.RIGHT) {
            if(v4 == Type.CENTER_X) {
            }
            else {
                v1 = false;
            }
        }

        return v1;
    }

    public boolean isSnapCompatibleWith(ConstraintAnchor arg6) {
        if(this.mType == Type.CENTER) {
            return 0;
        }

        if(this.mType == arg6.getType()) {
            return 1;
        }

        int v1 = 8;
        int v4 = 7;
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 2: {
                goto label_68;
            }
            case 3: {
                goto label_58;
            }
            case 4: {
                goto label_48;
            }
            case 5: {
                goto label_38;
            }
            case 7: {
                goto label_30;
            }
            case 8: {
                goto label_22;
            }
            case 1: 
            case 6: 
            case 9: {
                return 0;
            }
        }

        throw new AssertionError(this.mType.name());
    label_68:
        int v6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg6.getType().ordinal()];
        if(v6 != 3) {
            if(v6 != v4) {
                return 0;
            }

            return 1;
        }

        return 1;
    label_38:
        v6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg6.getType().ordinal()];
        if(v6 != 4) {
            if(v6 != v1) {
                return 0;
            }

            return 1;
        }

        return 1;
    label_22:
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg6.getType().ordinal()]) {
            case 4: {
                return 1;
            }
            case 5: {
                return 1;
            }
        }

        return 0;
    label_58:
        v6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg6.getType().ordinal()];
        if(v6 != 2) {
            if(v6 != v4) {
                return 0;
            }

            return 1;
        }

        return 1;
    label_30:
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg6.getType().ordinal()]) {
            case 2: {
                return 1;
            }
            case 3: {
                return 1;
            }
        }

        return 0;
    label_48:
        v6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg6.getType().ordinal()];
        if(v6 != 5) {
            if(v6 != v1) {
                return 0;
            }

            return 1;
        }

        return 1;
    }

    public boolean isValidConnection(ConstraintAnchor arg6) {
        boolean v0 = false;
        if(arg6 == null) {
            return 0;
        }

        Type v1 = arg6.getType();
        if(v1 == this.mType) {
            if(this.mType == Type.BASELINE && (!arg6.getOwner().hasBaseline() || !this.getOwner().hasBaseline())) {
                return 0;
            }

            return 1;
        }

        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1: {
                goto label_67;
            }
            case 2: 
            case 3: {
                goto label_48;
            }
            case 4: 
            case 5: {
                goto label_29;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return 0;
            }
        }

        throw new AssertionError(this.mType.name());
    label_67:
        if(v1 != Type.BASELINE && v1 != Type.CENTER_X && v1 != Type.CENTER_Y) {
            v0 = true;
        }

        return v0;
    label_29:
        boolean v2 = v1 == Type.TOP || v1 == Type.BOTTOM ? true : false;
        if((arg6.getOwner() instanceof Guideline)) {
            if(!v2) {
                if(v1 == Type.CENTER_Y) {
                }
                else {
                    return false;
                }
            }

            v2 = true;
        }

        return v2;
    label_48:
        v2 = v1 == Type.LEFT || v1 == Type.RIGHT ? true : false;
        if((arg6.getOwner() instanceof Guideline)) {
            if(!v2) {
                if(v1 == Type.CENTER_X) {
                }
                else {
                    return false;
                }
            }

            v2 = true;
        }

        return v2;
    }

    public boolean isVerticalAnchor() {
        switch(androidx.constraintlayout.solver.widgets.ConstraintAnchor$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[this.mType.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 7: {
                return 0;
            }
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 9: {
                return 1;
            }
        }

        throw new AssertionError(this.mType.name());
        return 1;
    }

    public void reset() {
        this.mTarget = null;
        this.mMargin = 0;
        this.mGoneMargin = -1;
        this.mStrength = Strength.STRONG;
        this.mConnectionCreator = 0;
        this.mConnectionType = ConnectionType.RELAXED;
        this.mResolutionAnchor.reset();
    }

    public void resetSolverVariable(Cache arg3) {
        if(this.mSolverVariable == null) {
            this.mSolverVariable = new SolverVariable(androidx.constraintlayout.solver.SolverVariable$Type.UNRESTRICTED, null);
        }
        else {
            this.mSolverVariable.reset();
        }
    }

    public void setConnectionCreator(int arg1) {
        this.mConnectionCreator = arg1;
    }

    public void setConnectionType(ConnectionType arg1) {
        this.mConnectionType = arg1;
    }

    public void setGoneMargin(int arg2) {
        if(this.isConnected()) {
            this.mGoneMargin = arg2;
        }
    }

    public void setMargin(int arg2) {
        if(this.isConnected()) {
            this.mMargin = arg2;
        }
    }

    public void setStrength(Strength arg2) {
        if(this.isConnected()) {
            this.mStrength = arg2;
        }
    }

    public String toString() {
        return this.mOwner.getDebugName() + ":" + this.mType.toString();
    }
}

