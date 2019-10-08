package com.google.android.gms.common.images;

public final class Size {
    private final int zand;
    private final int zane;

    public Size(int arg1, int arg2) {
        super();
        this.zand = arg1;
        this.zane = arg2;
    }

    public final boolean equals(Object arg5) {
        if(arg5 == null) {
            return 0;
        }

        if(this == (((Size)arg5))) {
            return 1;
        }

        if((arg5 instanceof Size)) {
            if(this.zand == ((Size)arg5).zand && this.zane == ((Size)arg5).zane) {
                return 1;
            }

            return 0;
        }

        return 0;
    }

    public final int getHeight() {
        return this.zane;
    }

    public final int getWidth() {
        return this.zand;
    }

    public final int hashCode() {
        return this.zane ^ (this.zand << 16 | this.zand >>> 16);
    }

    public static Size parseSize(String arg3) throws NumberFormatException {
        if(arg3 != null) {
            int v0 = arg3.indexOf(42);
            if(v0 < 0) {
                v0 = arg3.indexOf(120);
            }

            if(v0 >= 0) {
                try {
                    return new Size(Integer.parseInt(arg3.substring(0, v0)), Integer.parseInt(arg3.substring(v0 + 1)));
                }
                catch(NumberFormatException ) {
                    throw Size.zah(arg3);
                }
            }

            throw Size.zah(arg3);
        }

        throw new IllegalArgumentException("string must not be null");
    }

    public final String toString() {
        int v0 = this.zand;
        int v1 = this.zane;
        StringBuilder v2 = new StringBuilder(23);
        v2.append(v0);
        v2.append("x");
        v2.append(v1);
        return v2.toString();
    }

    private static NumberFormatException zah(String arg3) {
        StringBuilder v2 = new StringBuilder(String.valueOf(arg3).length() + 16);
        v2.append("Invalid Size: \"");
        v2.append(arg3);
        v2.append("\"");
        throw new NumberFormatException(v2.toString());
    }
}

