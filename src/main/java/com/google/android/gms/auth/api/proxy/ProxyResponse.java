package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;

@KeepForSdkWithMembers @Class(creator="ProxyResponseCreator") public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR = null;
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    @Field(id=5) public final byte[] body;
    @Field(id=1) public final int googlePlayServicesStatusCode;
    @Field(id=2) public final PendingIntent recoveryAction;
    @Field(id=3) public final int statusCode;
    @VersionField(id=1000) private final int versionCode;
    @Field(id=4) private final Bundle zzby;

    static {
        ProxyResponse.CREATOR = new zzb();
    }

    @Constructor ProxyResponse(@Param(id=1000) int arg1, @Param(id=1) int arg2, @Param(id=2) PendingIntent arg3, @Param(id=3) int arg4, @Param(id=4) Bundle arg5, @Param(id=5) byte[] arg6) {
        super();
        this.versionCode = arg1;
        this.googlePlayServicesStatusCode = arg2;
        this.statusCode = arg4;
        this.zzby = arg5;
        this.body = arg6;
        this.recoveryAction = arg3;
    }

    public ProxyResponse(int arg8, PendingIntent arg9, int arg10, Bundle arg11, byte[] arg12) {
        this(1, arg8, arg9, arg10, arg11, arg12);
    }

    private ProxyResponse(int arg8, Bundle arg9, byte[] arg10) {
        this(1, 0, null, arg8, arg9, arg10);
    }

    public ProxyResponse(int arg1, Map arg2, byte[] arg3) {
        this(arg1, ProxyResponse.zza(arg2), arg3);
    }

    public static ProxyResponse createErrorProxyResponse(int arg8, PendingIntent arg9, int arg10, Map arg11, byte[] arg12) {
        return new ProxyResponse(1, arg8, arg9, arg10, ProxyResponse.zza(arg11), arg12);
    }

    public Map getHeaders() {
        if(this.zzby == null) {
            return Collections.emptyMap();
        }

        HashMap v0 = new HashMap();
        Iterator v1 = this.zzby.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            ((Map)v0).put(v2, this.zzby.getString(((String)v2)));
        }

        return ((Map)v0);
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.googlePlayServicesStatusCode);
        SafeParcelWriter.writeParcelable(arg5, 2, this.recoveryAction, arg6, false);
        SafeParcelWriter.writeInt(arg5, 3, this.statusCode);
        SafeParcelWriter.writeBundle(arg5, 4, this.zzby, false);
        SafeParcelWriter.writeByteArray(arg5, 5, this.body, false);
        SafeParcelWriter.writeInt(arg5, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    private static Bundle zza(Map arg3) {
        Bundle v0 = new Bundle();
        if(arg3 == null) {
            return v0;
        }

        Iterator v3 = arg3.entrySet().iterator();
        while(v3.hasNext()) {
            Object v1 = v3.next();
            v0.putString(((Map$Entry)v1).getKey(), ((Map$Entry)v1).getValue());
        }

        return v0;
    }
}

