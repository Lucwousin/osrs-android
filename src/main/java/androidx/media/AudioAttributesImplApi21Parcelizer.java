package androidx.media;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo(value={Scope.LIBRARY}) public final class AudioAttributesImplApi21Parcelizer {
    public AudioAttributesImplApi21Parcelizer() {
        super();
    }

    public static AudioAttributesImplApi21 read(VersionedParcel arg3) {
        AudioAttributesImplApi21 v0 = new AudioAttributesImplApi21();
        v0.mAudioAttributes = arg3.readParcelable(v0.mAudioAttributes, 1);
        v0.mLegacyStreamType = arg3.readInt(v0.mLegacyStreamType, 2);
        return v0;
    }

    public static void write(AudioAttributesImplApi21 arg2, VersionedParcel arg3) {
        arg3.setSerializationFlags(false, false);
        arg3.writeParcelable(arg2.mAudioAttributes, 1);
        arg3.writeInt(arg2.mLegacyStreamType, 2);
    }
}

