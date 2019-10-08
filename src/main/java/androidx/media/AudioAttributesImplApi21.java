package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

@TargetApi(value=21) class AudioAttributesImplApi21 implements AudioAttributesImpl {
    private static final String TAG = "AudioAttributesCompat21";
    AudioAttributes mAudioAttributes;
    int mLegacyStreamType;
    static Method sAudioAttributesToLegacyStreamType;

    AudioAttributesImplApi21() {
        super();
        this.mLegacyStreamType = -1;
    }

    AudioAttributesImplApi21(AudioAttributes arg2) {
        this(arg2, -1);
    }

    AudioAttributesImplApi21(AudioAttributes arg2, int arg3) {
        super();
        this.mLegacyStreamType = -1;
        this.mAudioAttributes = arg2;
        this.mLegacyStreamType = arg3;
    }

    public boolean equals(Object arg2) {
        if(!(arg2 instanceof AudioAttributesImplApi21)) {
            return 0;
        }

        return this.mAudioAttributes.equals(((AudioAttributesImplApi21)arg2).mAudioAttributes);
    }

    public static AudioAttributesImpl fromBundle(Bundle arg3) {
        AudioAttributesImpl v0 = null;
        if(arg3 == null) {
            return v0;
        }

        Parcelable v1 = arg3.getParcelable("androidx.media.audio_attrs.FRAMEWORKS");
        if(v1 == null) {
            return v0;
        }

        return new AudioAttributesImplApi21(((AudioAttributes)v1), arg3.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public Object getAudioAttributes() {
        return this.mAudioAttributes;
    }

    static Method getAudioAttributesToLegacyStreamTypeMethod() {
        try {
            if(AudioAttributesImplApi21.sAudioAttributesToLegacyStreamType == null) {
                AudioAttributesImplApi21.sAudioAttributesToLegacyStreamType = AudioAttributes.class.getMethod("toLegacyStreamType", AudioAttributes.class);
            }
        }
        catch(NoSuchMethodException ) {
            return null;
        }

        return AudioAttributesImplApi21.sAudioAttributesToLegacyStreamType;
    }

    public int getContentType() {
        return this.mAudioAttributes.getContentType();
    }

    public int getFlags() {
        return this.mAudioAttributes.getFlags();
    }

    public int getLegacyStreamType() {
        int v1 = -1;
        if(this.mLegacyStreamType != v1) {
            return this.mLegacyStreamType;
        }

        Method v0 = AudioAttributesImplApi21.getAudioAttributesToLegacyStreamTypeMethod();
        if(v0 == null) {
            Log.w("AudioAttributesCompat21", "No AudioAttributes#toLegacyStreamType() on API: " + Build$VERSION.SDK_INT);
            return v1;
        }

        Object v2_1 = null;
        try {
            return v0.invoke(v2_1, this.mAudioAttributes).intValue();
        }
        catch(IllegalAccessException v0_1) {
            Log.w("AudioAttributesCompat21", "getLegacyStreamType() failed on API: " + Build$VERSION.SDK_INT, ((Throwable)v0_1));
            return v1;
        }
    }

    public int getRawLegacyStreamType() {
        return this.mLegacyStreamType;
    }

    public int getUsage() {
        return this.mAudioAttributes.getUsage();
    }

    public int getVolumeControlStream() {
        if(Build$VERSION.SDK_INT >= 26) {
            return this.mAudioAttributes.getVolumeControlStream();
        }

        return AudioAttributesCompat.toVolumeStreamType(true, this.getFlags(), this.getUsage());
    }

    public int hashCode() {
        return this.mAudioAttributes.hashCode();
    }

    @NonNull public Bundle toBundle() {
        Bundle v0 = new Bundle();
        v0.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.mAudioAttributes);
        if(this.mLegacyStreamType != -1) {
            v0.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", this.mLegacyStreamType);
        }

        return v0;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.mAudioAttributes;
    }
}

