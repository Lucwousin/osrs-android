package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;

public class ConstraintHorizontalLayout extends ConstraintWidgetContainer {
    public enum ContentAlignment {
        public static final enum ContentAlignment BEGIN;
        public static final enum ContentAlignment BOTTOM;
        public static final enum ContentAlignment END;
        public static final enum ContentAlignment LEFT;
        public static final enum ContentAlignment MIDDLE;
        public static final enum ContentAlignment RIGHT;
        public static final enum ContentAlignment TOP;
        public static final enum ContentAlignment VERTICAL_MIDDLE;

        static {
            ContentAlignment.BEGIN = new ContentAlignment("BEGIN", 0);
            ContentAlignment.MIDDLE = new ContentAlignment("MIDDLE", 1);
            ContentAlignment.END = new ContentAlignment("END", 2);
            ContentAlignment.TOP = new ContentAlignment("TOP", 3);
            ContentAlignment.VERTICAL_MIDDLE = new ContentAlignment("VERTICAL_MIDDLE", 4);
            ContentAlignment.BOTTOM = new ContentAlignment("BOTTOM", 5);
            ContentAlignment.LEFT = new ContentAlignment("LEFT", 6);
            ContentAlignment.RIGHT = new ContentAlignment("RIGHT", 7);
            ContentAlignment.$VALUES = new ContentAlignment[]{ContentAlignment.BEGIN, ContentAlignment.MIDDLE, ContentAlignment.END, ContentAlignment.TOP, ContentAlignment.VERTICAL_MIDDLE, ContentAlignment.BOTTOM, ContentAlignment.LEFT, ContentAlignment.RIGHT};
        }

        private ContentAlignment(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static ContentAlignment valueOf(String arg1) {
            return Enum.valueOf(ContentAlignment.class, arg1);
        }

        public static ContentAlignment[] values() {
            return ContentAlignment.$VALUES.clone();
        }
    }

    private ContentAlignment mAlignment;

    public ConstraintHorizontalLayout() {
        super();
        this.mAlignment = ContentAlignment.MIDDLE;
    }

    public ConstraintHorizontalLayout(int arg1, int arg2) {
        super(arg1, arg2);
        this.mAlignment = ContentAlignment.MIDDLE;
    }

    public ConstraintHorizontalLayout(int arg1, int arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3, arg4);
        this.mAlignment = ContentAlignment.MIDDLE;
    }

    public void addToSolver(LinearSystem arg10) {
        if(this.mChildren.size() != 0) {
            int v0 = 0;
            int v1 = this.mChildren.size();
            ConstraintHorizontalLayout v4 = this;
            while(v0 < v1) {
                Object v8 = this.mChildren.get(v0);
                if(v4 != this) {
                    ((ConstraintWidget)v8).connect(Type.LEFT, ((ConstraintWidget)v4), Type.RIGHT);
                    ((ConstraintWidget)v4).connect(Type.RIGHT, ((ConstraintWidget)v8), Type.LEFT);
                }
                else {
                    Strength v2 = Strength.STRONG;
                    if(this.mAlignment == ContentAlignment.END) {
                        v2 = Strength.WEAK;
                    }

                    v8.connect(Type.LEFT, ((ConstraintWidget)v4), Type.LEFT, 0, v2);
                }

                ((ConstraintWidget)v8).connect(Type.TOP, ((ConstraintWidget)this), Type.TOP);
                ((ConstraintWidget)v8).connect(Type.BOTTOM, ((ConstraintWidget)this), Type.BOTTOM);
                ++v0;
                Object v4_1 = v8;
            }

            if(v4 == this) {
                goto label_52;
            }

            Strength v0_1 = Strength.STRONG;
            if(this.mAlignment == ContentAlignment.BEGIN) {
                v0_1 = Strength.WEAK;
            }

            v4.connect(Type.RIGHT, this, Type.RIGHT, 0, v0_1);
        }

    label_52:
        super.addToSolver(arg10);
    }
}

