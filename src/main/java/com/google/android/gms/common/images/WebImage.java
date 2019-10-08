package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator="WebImageCreator") public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(getter="getWidth", id=3) private final int zand;
    @Field(getter="getHeight", id=4) private final int zane;
    @Field(getter="getUrl", id=2) private final Uri zanf;

    static {
        WebImage.CREATOR = new zae();
    }

    @Constructor WebImage(@Param(id=1) int arg1, @Param(id=2) Uri arg2, @Param(id=3) int arg3, @Param(id=4) int arg4) {
        super();
        this.zale = arg1;
        this.zanf = arg2;
        this.zand = arg3;
        this.zane = arg4;
    }

    public WebImage(Uri arg2) throws IllegalArgumentException {
        this(arg2, 0, 0);
    }

    public WebImage(Uri arg2, int arg3, int arg4) throws IllegalArgumentException {
        this(1, arg2, arg3, arg4);
        if(arg2 != null) {
            if(arg3 >= 0 && arg4 >= 0) {
                return;
            }

            throw new IllegalArgumentException("width and height must not be negative");
        }

        throw new IllegalArgumentException("url cannot be null");
    }

    @KeepForSdk public WebImage(JSONObject arg5) throws IllegalArgumentException {
        this(WebImage.zaa(arg5), arg5.optInt("width", 0), arg5.optInt("height", 0));
    }

    public final boolean equals(Object arg5) {
        if(this == (((WebImage)arg5))) {
            return 1;
        }

        if(arg5 != null) {
            if(!(arg5 instanceof WebImage)) {
            }
            else {
                if((Objects.equal(this.zanf, ((WebImage)arg5).zanf)) && this.zand == ((WebImage)arg5).zand && this.zane == ((WebImage)arg5).zane) {
                    return 1;
                }

                return 0;
            }
        }

        return 0;
    }

    public final int getHeight() {
        return this.zane;
    }

    public final Uri getUrl() {
        return this.zanf;
    }

    public final int getWidth() {
        return this.zand;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zanf, Integer.valueOf(this.zand), Integer.valueOf(this.zane)});
    }

    @KeepForSdk public final JSONObject toJson() {
        JSONObject v0 = new JSONObject();
        try {
            v0.put("url", this.zanf.toString());
            v0.put("width", this.zand);
            v0.put("height", this.zane);
            return v0;
        }
        catch(JSONException ) {
            return v0;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.zand), Integer.valueOf(this.zane), this.zanf.toString());
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeParcelable(arg5, 2, this.getUrl(), arg6, false);
        SafeParcelWriter.writeInt(arg5, 3, this.getWidth());
        SafeParcelWriter.writeInt(arg5, 4, this.getHeight());
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    private static Uri zaa(JSONObject arg1) {
        Uri v1;
        if(arg1.has("url")) {
            try {
                v1 = Uri.parse(arg1.getString("url"));
            }
            catch(JSONException ) {
            label_7:
                v1 = null;
            }
        }
        else {
            goto label_7;
        }

        return v1;
    }
}

