package androidx.media;

import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat implements VersionedParcelable {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface AttributeContentType {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface AttributeUsage {
    }

    abstract class AudioManagerHidden {
        public static final int STREAM_ACCESSIBILITY = 10;
        public static final int STREAM_BLUETOOTH_SCO = 6;
        public static final int STREAM_SYSTEM_ENFORCED = 7;
        public static final int STREAM_TTS = 9;

        private AudioManagerHidden() {
            super();
        }
    }

    public class Builder {
        private int mContentType;
        private int mFlags;
        private int mLegacyStream;
        private int mUsage;

        public Builder() {
            super();
            this.mUsage = 0;
            this.mContentType = 0;
            this.mFlags = 0;
            this.mLegacyStream = -1;
        }

        public Builder(AudioAttributesCompat arg2) {
            super();
            this.mUsage = 0;
            this.mContentType = 0;
            this.mFlags = 0;
            this.mLegacyStream = -1;
            this.mUsage = arg2.getUsage();
            this.mContentType = arg2.getContentType();
            this.mFlags = arg2.getFlags();
            this.mLegacyStream = arg2.getRawLegacyStreamType();
        }

        public AudioAttributesCompat build() {
            AudioAttributesImplBase v1_1;
            if((AudioAttributesCompat.sForceLegacyBehavior) || Build$VERSION.SDK_INT < 21) {
                v1_1 = new AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
            }
            else {
                AudioAttributes$Builder v0 = new AudioAttributes$Builder().setContentType(this.mContentType).setFlags(this.mFlags).setUsage(this.mUsage);
                if(this.mLegacyStream != -1) {
                    v0.setLegacyStreamType(this.mLegacyStream);
                }

                AudioAttributesImplApi21 v1 = new AudioAttributesImplApi21(v0.build(), this.mLegacyStream);
            }

            return new AudioAttributesCompat(((AudioAttributesImpl)v1_1));
        }

        public Builder setContentType(int arg1) {
            switch(arg1) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    this.mContentType = arg1;
                    break;
                }
                default: {
                    this.mUsage = 0;
                    break;
                }
            }

            return this;
        }

        public Builder setFlags(int arg2) {
            this.mFlags |= arg2 & 0x3FF;
            return this;
        }

        Builder setInternalLegacyStreamType(int arg4) {
            int v1 = 4;
            switch(arg4) {
                case 0: {
                    goto label_40;
                }
                case 1: {
                    goto label_38;
                }
                case 2: {
                    goto label_36;
                }
                case 3: {
                    goto label_33;
                }
                case 4: {
                    goto label_31;
                }
                case 5: {
                    goto label_29;
                }
                case 6: {
                    goto label_24;
                }
                case 7: {
                    goto label_20;
                }
                case 8: {
                    goto label_18;
                }
                case 9: {
                    goto label_16;
                }
                case 10: {
                    goto label_14;
                }
            }

            Log.e("AudioAttributesCompat", "Invalid stream type " + arg4 + " for AudioAttributesCompat");
            goto label_41;
        label_33:
            this.mContentType = 2;
            goto label_41;
        label_18:
            this.mContentType = v1;
            goto label_41;
        label_36:
            this.mContentType = v1;
            goto label_41;
        label_20:
            this.mFlags |= 1;
        label_38:
            this.mContentType = v1;
            goto label_41;
        label_40:
            this.mContentType = 1;
            goto label_41;
        label_24:
            this.mContentType = 1;
            this.mFlags |= v1;
            goto label_41;
        label_29:
            this.mContentType = v1;
            goto label_41;
        label_14:
            this.mContentType = 1;
            goto label_41;
        label_31:
            this.mContentType = v1;
            goto label_41;
        label_16:
            this.mContentType = v1;
        label_41:
            this.mUsage = AudioAttributesCompat.usageForStreamType(arg4);
            return this;
        }

        public Builder setLegacyStreamType(int arg3) {
            if(arg3 != 10) {
                this.mLegacyStream = arg3;
                if(Build$VERSION.SDK_INT >= 21) {
                    return this.setInternalLegacyStreamType(arg3);
                }

                return this;
            }

            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        public Builder setUsage(int arg3) {
            switch(arg3) {
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    this.mUsage = arg3;
                    break;
                }
                case 16: {
                    if(!AudioAttributesCompat.sForceLegacyBehavior && Build$VERSION.SDK_INT > 25) {
                        this.mUsage = arg3;
                        return this;
                    }

                    this.mUsage = 12;
                    break;
                }
                default: {
                    this.mUsage = 0;
                    break;
                }
            }

            return this;
        }
    }

    static final String AUDIO_ATTRIBUTES_CONTENT_TYPE = "androidx.media.audio_attrs.CONTENT_TYPE";
    static final String AUDIO_ATTRIBUTES_FLAGS = "androidx.media.audio_attrs.FLAGS";
    static final String AUDIO_ATTRIBUTES_FRAMEWORKS = "androidx.media.audio_attrs.FRAMEWORKS";
    static final String AUDIO_ATTRIBUTES_LEGACY_STREAM_TYPE = "androidx.media.audio_attrs.LEGACY_STREAM_TYPE";
    static final String AUDIO_ATTRIBUTES_USAGE = "androidx.media.audio_attrs.USAGE";
    public static final int CONTENT_TYPE_MOVIE = 3;
    public static final int CONTENT_TYPE_MUSIC = 2;
    public static final int CONTENT_TYPE_SONIFICATION = 4;
    public static final int CONTENT_TYPE_SPEECH = 1;
    public static final int CONTENT_TYPE_UNKNOWN = 0;
    static final int FLAG_ALL = 0x3FF;
    static final int FLAG_ALL_PUBLIC = 273;
    public static final int FLAG_AUDIBILITY_ENFORCED = 1;
    static final int FLAG_BEACON = 8;
    static final int FLAG_BYPASS_INTERRUPTION_POLICY = 0x40;
    static final int FLAG_BYPASS_MUTE = 0x80;
    static final int FLAG_DEEP_BUFFER = 0x200;
    public static final int FLAG_HW_AV_SYNC = 16;
    static final int FLAG_HW_HOTWORD = 0x20;
    static final int FLAG_LOW_LATENCY = 0x100;
    static final int FLAG_SCO = 4;
    static final int FLAG_SECURE = 2;
    static final int INVALID_STREAM_TYPE = -1;
    private static final int[] SDK_USAGES = null;
    private static final int SUPPRESSIBLE_CALL = 2;
    private static final int SUPPRESSIBLE_NOTIFICATION = 1;
    private static final SparseIntArray SUPPRESSIBLE_USAGES = null;
    private static final String TAG = "AudioAttributesCompat";
    public static final int USAGE_ALARM = 4;
    public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int USAGE_ASSISTANT = 16;
    public static final int USAGE_GAME = 14;
    public static final int USAGE_MEDIA = 1;
    public static final int USAGE_NOTIFICATION = 5;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int USAGE_NOTIFICATION_EVENT = 10;
    public static final int USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int USAGE_UNKNOWN = 0;
    private static final int USAGE_VIRTUAL_SOURCE = 15;
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    AudioAttributesImpl mImpl;
    static boolean sForceLegacyBehavior;

    static {
        AudioAttributesCompat.SUPPRESSIBLE_USAGES = new SparseIntArray();
        AudioAttributesCompat.SUPPRESSIBLE_USAGES.put(5, 1);
        AudioAttributesCompat.SUPPRESSIBLE_USAGES.put(6, 2);
        AudioAttributesCompat.SUPPRESSIBLE_USAGES.put(7, 2);
        AudioAttributesCompat.SUPPRESSIBLE_USAGES.put(8, 1);
        AudioAttributesCompat.SUPPRESSIBLE_USAGES.put(9, 1);
        AudioAttributesCompat.SUPPRESSIBLE_USAGES.put(10, 1);
        AudioAttributesCompat.SDK_USAGES = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
        super();
    }

    AudioAttributesCompat(AudioAttributesImpl arg1) {
        super();
        this.mImpl = arg1;
    }

    public boolean equals(Object arg3) {
        boolean v1 = false;
        if(!(arg3 instanceof AudioAttributesCompat)) {
            return 0;
        }

        if(this.mImpl == null) {
            if(((AudioAttributesCompat)arg3).mImpl == null) {
                v1 = true;
            }

            return v1;
        }

        return this.mImpl.equals(((AudioAttributesCompat)arg3).mImpl);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static AudioAttributesCompat fromBundle(Bundle arg2) {
        AudioAttributesImpl v2 = Build$VERSION.SDK_INT >= 21 ? AudioAttributesImplApi21.fromBundle(arg2) : AudioAttributesImplBase.fromBundle(arg2);
        AudioAttributesCompat v2_1 = v2 == null ? null : new AudioAttributesCompat(v2);
        return v2_1;
    }

    public int getContentType() {
        return this.mImpl.getContentType();
    }

    public int getFlags() {
        return this.mImpl.getFlags();
    }

    public int getLegacyStreamType() {
        return this.mImpl.getLegacyStreamType();
    }

    int getRawLegacyStreamType() {
        return this.mImpl.getRawLegacyStreamType();
    }

    public int getUsage() {
        return this.mImpl.getUsage();
    }

    public int getVolumeControlStream() {
        return this.mImpl.getVolumeControlStream();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static void setForceLegacyBehavior(boolean arg0) {
        AudioAttributesCompat.sForceLegacyBehavior = arg0;
    }

    @NonNull @RestrictTo(value={Scope.LIBRARY_GROUP}) public Bundle toBundle() {
        return this.mImpl.toBundle();
    }

    public String toString() {
        return this.mImpl.toString();
    }

    static int toVolumeStreamType(boolean arg3, int arg4, int arg5) {
        int v1 = 1;
        if((arg4 & 1) == 1) {
            if(arg3) {
            }
            else {
                v1 = 7;
            }

            return v1;
        }

        int v0 = 4;
        int v2 = 0;
        if((arg4 & v0) == v0) {
            if(arg3) {
            }
            else {
                v2 = 6;
            }

            return v2;
        }

        arg4 = 3;
        switch(arg5) {
            case 0: {
                goto label_33;
            }
            case 2: {
                return 0;
            }
            case 3: {
                goto label_27;
            }
            case 4: {
                return v0;
            }
            case 6: {
                return 2;
            }
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return 5;
            }
            case 11: {
                return 10;
            }
            case 13: {
                return 1;
            }
            case 1: 
            case 12: 
            case 14: 
            case 16: {
                return arg4;
            }
        }

        if(!arg3) {
            return arg4;
        }

        StringBuilder v4 = new StringBuilder();
        v4.append("Unknown usage value ");
        v4.append(arg5);
        v4.append(" in audio attributes");
        throw new IllegalArgumentException(v4.toString());
    label_33:
        if(arg3) {
            arg4 = 0x80000000;
        }

        return arg4;
    label_27:
        if(arg3) {
        }
        else {
            v2 = 8;
        }

        return v2;
    }

    static int toVolumeStreamType(boolean arg1, AudioAttributesCompat arg2) {
        return AudioAttributesCompat.toVolumeStreamType(arg1, arg2.getFlags(), arg2.getUsage());
    }

    @Nullable public Object unwrap() {
        return this.mImpl.getAudioAttributes();
    }

    static int usageForStreamType(int arg1) {
        int v0 = 2;
        switch(arg1) {
            case 0: {
                return v0;
            }
            case 2: {
                return 6;
            }
            case 3: {
                return 1;
            }
            case 4: {
                return 4;
            }
            case 5: {
                return 5;
            }
            case 6: {
                return v0;
            }
            case 1: 
            case 7: {
                return 13;
            }
            case 8: {
                return 3;
            }
            case 10: {
                return 11;
            }
        }

        return 0;
    }

    static String usageToString(int arg2) {
        switch(arg2) {
            case 0: {
                return "USAGE_UNKNOWN";
            }
            case 1: {
                return "USAGE_MEDIA";
            }
            case 2: {
                return "USAGE_VOICE_COMMUNICATION";
            }
            case 3: {
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            }
            case 4: {
                return "USAGE_ALARM";
            }
            case 5: {
                return "USAGE_NOTIFICATION";
            }
            case 6: {
                return "USAGE_NOTIFICATION_RINGTONE";
            }
            case 7: {
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            }
            case 8: {
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            }
            case 9: {
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            }
            case 10: {
                return "USAGE_NOTIFICATION_EVENT";
            }
            case 11: {
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            }
            case 12: {
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            }
            case 13: {
                return "USAGE_ASSISTANCE_SONIFICATION";
            }
            case 14: {
                return "USAGE_GAME";
            }
            case 16: {
                return "USAGE_ASSISTANT";
            }
        }

        return "unknown usage " + arg2;
    }

    @Nullable public static AudioAttributesCompat wrap(@NonNull Object arg2) {
        if(Build$VERSION.SDK_INT >= 21 && !AudioAttributesCompat.sForceLegacyBehavior) {
            AudioAttributesImplApi21 v0 = new AudioAttributesImplApi21(((AudioAttributes)arg2));
            AudioAttributesCompat v2 = new AudioAttributesCompat();
            v2.mImpl = ((AudioAttributesImpl)v0);
            return v2;
        }

        return null;
    }
}

