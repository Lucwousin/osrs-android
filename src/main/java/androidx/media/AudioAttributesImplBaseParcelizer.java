package androidx.media;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo(value={Scope.LIBRARY}) public final class AudioAttributesImplBaseParcelizer {
    public AudioAttributesImplBaseParcelizer() {
        super();
    }

    public static AudioAttributesImplBase read(VersionedParcel arg3) {
        AudioAttributesImplBase v0 = new AudioAttributesImplBase();
        v0.mUsage = arg3.readInt(v0.mUsage, 1);
        v0.mContentType = arg3.readInt(v0.mContentType, 2);
        v0.mFlags = arg3.readInt(v0.mFlags, 3);
        v0.mLegacyStream = arg3.readInt(v0.mLegacyStream, 4);
        return v0;
    }

    public static void write(AudioAttributesImplBase arg2, VersionedParcel arg3) {
        arg3.setSerializationFlags(false, false);
        arg3.writeInt(arg2.mUsage, 1);
        arg3.writeInt(arg2.mContentType, 2);
        arg3.writeInt(arg2.mFlags, 3);
        arg3.writeInt(arg2.mLegacyStream, 4);
    }
}

