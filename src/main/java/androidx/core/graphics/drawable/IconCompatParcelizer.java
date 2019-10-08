package androidx.core.graphics.drawable;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo(value={Scope.LIBRARY}) public class IconCompatParcelizer {
    public IconCompatParcelizer() {
        super();
    }

    public static IconCompat read(VersionedParcel arg3) {
        IconCompat v0 = new IconCompat();
        v0.mType = arg3.readInt(v0.mType, 1);
        v0.mData = arg3.readByteArray(v0.mData, 2);
        v0.mParcelable = arg3.readParcelable(v0.mParcelable, 3);
        v0.mInt1 = arg3.readInt(v0.mInt1, 4);
        v0.mInt2 = arg3.readInt(v0.mInt2, 5);
        v0.mTintList = arg3.readParcelable(v0.mTintList, 6);
        v0.mTintModeStr = arg3.readString(v0.mTintModeStr, 7);
        v0.onPostParceling();
        return v0;
    }

    public static void write(IconCompat arg2, VersionedParcel arg3) {
        arg3.setSerializationFlags(true, true);
        arg2.onPreParceling(arg3.isStream());
        arg3.writeInt(arg2.mType, 1);
        arg3.writeByteArray(arg2.mData, 2);
        arg3.writeParcelable(arg2.mParcelable, 3);
        arg3.writeInt(arg2.mInt1, 4);
        arg3.writeInt(arg2.mInt2, 5);
        arg3.writeParcelable(arg2.mTintList, 6);
        arg3.writeString(arg2.mTintModeStr, 7);
    }
}

