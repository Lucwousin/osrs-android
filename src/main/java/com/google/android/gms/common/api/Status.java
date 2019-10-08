package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender$SendIntentException;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk @Class(creator="StatusCreator") public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    public static final Parcelable$Creator CREATOR;
    @KeepForSdk public static final Status RESULT_CANCELED;
    @KeepForSdk public static final Status RESULT_DEAD_CLIENT;
    @KeepForSdk public static final Status RESULT_INTERNAL_ERROR;
    @KeepForSdk public static final Status RESULT_INTERRUPTED;
    @KeepForSdk @VisibleForTesting public static final Status RESULT_SUCCESS;
    @KeepForSdk public static final Status RESULT_TIMEOUT;
    private static final Status zzaq;
    @VersionField(id=1000) private final int zzg;
    @Field(getter="getStatusCode", id=1) private final int zzh;
    @Nullable @Field(getter="getPendingIntent", id=3) private final PendingIntent zzi;
    @Nullable @Field(getter="getStatusMessage", id=2) private final String zzj;

    static {
        Status.RESULT_SUCCESS = new Status(0);
        Status.RESULT_INTERRUPTED = new Status(14);
        Status.RESULT_INTERNAL_ERROR = new Status(8);
        Status.RESULT_TIMEOUT = new Status(15);
        Status.RESULT_CANCELED = new Status(16);
        Status.zzaq = new Status(17);
        Status.RESULT_DEAD_CLIENT = new Status(18);
        Status.CREATOR = new zzb();
    }

    @KeepForSdk public Status(int arg2) {
        this(arg2, null);
    }

    @KeepForSdk public Status(int arg2, @Nullable String arg3, @Nullable PendingIntent arg4) {
        this(1, arg2, arg3, arg4);
    }

    @KeepForSdk public Status(int arg3, @Nullable String arg4) {
        this(1, arg3, arg4, null);
    }

    @KeepForSdk @Constructor Status(@Param(id=1000) int arg1, @Param(id=1) int arg2, @Nullable @Param(id=2) String arg3, @Nullable @Param(id=3) PendingIntent arg4) {
        super();
        this.zzg = arg1;
        this.zzh = arg2;
        this.zzj = arg3;
        this.zzi = arg4;
    }

    public final boolean equals(Object arg4) {
        if(!(arg4 instanceof Status)) {
            return 0;
        }

        if(this.zzg == ((Status)arg4).zzg && this.zzh == ((Status)arg4).zzh && (Objects.equal(this.zzj, ((Status)arg4).zzj)) && (Objects.equal(this.zzi, ((Status)arg4).zzi))) {
            return 1;
        }

        return 0;
    }

    public final PendingIntent getResolution() {
        return this.zzi;
    }

    @KeepForSdk public final Status getStatus() {
        return this;
    }

    public final int getStatusCode() {
        return this.zzh;
    }

    @Nullable public final String getStatusMessage() {
        return this.zzj;
    }

    @VisibleForTesting public final boolean hasResolution() {
        if(this.zzi != null) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), this.zzj, this.zzi});
    }

    public final boolean isCanceled() {
        if(this.zzh == 16) {
            return 1;
        }

        return 0;
    }

    public final boolean isInterrupted() {
        if(this.zzh == 14) {
            return 1;
        }

        return 0;
    }

    public final boolean isSuccess() {
        if(this.zzh <= 0) {
            return 1;
        }

        return 0;
    }

    public final void startResolutionForResult(Activity arg9, int arg10) throws IntentSender$SendIntentException {
        if(!this.hasResolution()) {
            return;
        }

        arg9.startIntentSenderForResult(this.zzi.getIntentSender(), arg10, null, 0, 0, 0);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("statusCode", this.zzg()).add("resolution", this.zzi).toString();
    }

    @KeepForSdk public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.getStatusCode());
        SafeParcelWriter.writeString(arg5, 2, this.getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.zzi, arg6, false);
        SafeParcelWriter.writeInt(arg5, 1000, this.zzg);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    public final String zzg() {
        if(this.zzj != null) {
            return this.zzj;
        }

        return CommonStatusCodes.getStatusCodeString(this.zzh);
    }
}

