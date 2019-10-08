package androidx.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {
    int mContentType;
    int mFlags;
    int mLegacyStream;
    int mUsage;

    AudioAttributesImplBase() {
        super();
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
        this.mLegacyStream = -1;
    }

    AudioAttributesImplBase(int arg2, int arg3, int arg4, int arg5) {
        super();
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
        this.mLegacyStream = -1;
        this.mContentType = arg2;
        this.mFlags = arg3;
        this.mUsage = arg4;
        this.mLegacyStream = arg5;
    }

    public boolean equals(Object arg4) {
        boolean v1 = false;
        if(!(arg4 instanceof AudioAttributesImplBase)) {
            return 0;
        }

        if(this.mContentType == ((AudioAttributesImplBase)arg4).getContentType() && this.mFlags == ((AudioAttributesImplBase)arg4).getFlags() && this.mUsage == ((AudioAttributesImplBase)arg4).getUsage() && this.mLegacyStream == ((AudioAttributesImplBase)arg4).mLegacyStream) {
            v1 = true;
        }

        return v1;
    }

    public static AudioAttributesImpl fromBundle(Bundle arg5) {
        if(arg5 == null) {
            return null;
        }

        return new AudioAttributesImplBase(arg5.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), arg5.getInt("androidx.media.audio_attrs.FLAGS", 0), arg5.getInt("androidx.media.audio_attrs.USAGE", 0), arg5.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public Object getAudioAttributes() {
        return null;
    }

    public int getContentType() {
        return this.mContentType;
    }

    public int getFlags() {
        int v0 = this.mFlags;
        int v1 = this.getLegacyStreamType();
        if(v1 == 6) {
            v0 |= 4;
        }
        else if(v1 == 7) {
            v0 |= 1;
        }

        return v0 & 273;
    }

    public int getLegacyStreamType() {
        if(this.mLegacyStream != -1) {
            return this.mLegacyStream;
        }

        return AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
    }

    public int getRawLegacyStreamType() {
        return this.mLegacyStream;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public int getVolumeControlStream() {
        return AudioAttributesCompat.toVolumeStreamType(true, this.mFlags, this.mUsage);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mContentType), Integer.valueOf(this.mFlags), Integer.valueOf(this.mUsage), Integer.valueOf(this.mLegacyStream)});
    }

    @NonNull public Bundle toBundle() {
        Bundle v0 = new Bundle();
        v0.putInt("androidx.media.audio_attrs.USAGE", this.mUsage);
        v0.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.mContentType);
        v0.putInt("androidx.media.audio_attrs.FLAGS", this.mFlags);
        if(this.mLegacyStream != -1) {
            v0.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", this.mLegacyStream);
        }

        return v0;
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder("AudioAttributesCompat:");
        if(this.mLegacyStream != -1) {
            v0.append(" stream=");
            v0.append(this.mLegacyStream);
            v0.append(" derived");
        }

        v0.append(" usage=");
        v0.append(AudioAttributesCompat.usageToString(this.mUsage));
        v0.append(" content=");
        v0.append(this.mContentType);
        v0.append(" flags=0x");
        v0.append(Integer.toHexString(this.mFlags).toUpperCase());
        return v0.toString();
    }
}

