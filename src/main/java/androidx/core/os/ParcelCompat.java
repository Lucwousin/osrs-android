package androidx.core.os;

import android.os.Parcel;

public final class ParcelCompat {
    private ParcelCompat() {
        super();
    }

    public static boolean readBoolean(Parcel arg0) {
        boolean v0 = arg0.readInt() != 0 ? true : false;
        return v0;
    }

    public static void writeBoolean(Parcel arg0, boolean arg1) {
        arg0.writeInt(((int)arg1));
    }
}

