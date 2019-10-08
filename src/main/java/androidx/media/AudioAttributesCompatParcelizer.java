package androidx.media;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo(value={Scope.LIBRARY}) public final class AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
        super();
    }

    public static AudioAttributesCompat read(VersionedParcel arg3) {
        AudioAttributesCompat v0 = new AudioAttributesCompat();
        v0.mImpl = arg3.readVersionedParcelable(v0.mImpl, 1);
        return v0;
    }

    public static void write(AudioAttributesCompat arg1, VersionedParcel arg2) {
        arg2.setSerializationFlags(false, false);
        arg2.writeVersionedParcelable(arg1.mImpl, 1);
    }
}

