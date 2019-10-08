package com.appsflyer;

final class l {
    enum e {
        private int ˋ;
        public static final enum e ˏ;
        private static enum e ॱ;

        static {
            e.ॱ = new e("GOOGLE", 0, 0);
            e.ˏ = new e("AMAZON", 1, 1);
            e.ˊ = new e[]{e.ॱ, e.ˏ};
        }

        private e(String arg1, int arg2, int arg3) {
            super(arg1, arg2);
            this.ˋ = arg3;
        }

        public final String toString() {
            return String.valueOf(this.ˋ);
        }

        public static e valueOf(String arg1) {
            return Enum.valueOf(e.class, arg1);
        }

        public static e[] values() {
            return e.ˊ.clone();
        }
    }

    private String ˊ;
    private e ˎ;
    private boolean ॱ;

    l(e arg1, String arg2, boolean arg3) {
        super();
        this.ˎ = arg1;
        this.ˊ = arg2;
        this.ॱ = arg3;
    }

    public final String toString() {
        return String.format("%s,%s", this.ˊ, Boolean.valueOf(this.ॱ));
    }

    final String ˎ() {
        return this.ˊ;
    }

    final boolean ˏ() {
        return this.ॱ;
    }
}

