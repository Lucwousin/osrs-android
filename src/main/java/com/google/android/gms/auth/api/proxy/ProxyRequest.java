package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.util.Patterns;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@KeepForSdkWithMembers @Class(creator="ProxyRequestCreator") public class ProxyRequest extends AbstractSafeParcelable {
    @KeepForSdkWithMembers public class Builder {
        private String zzbz;
        private int zzca;
        private long zzcb;
        private byte[] zzcc;
        private Bundle zzcd;

        public Builder(String arg4) {
            super();
            this.zzca = ProxyRequest.HTTP_METHOD_GET;
            this.zzcb = 3000;
            this.zzcc = null;
            this.zzcd = new Bundle();
            Preconditions.checkNotEmpty(arg4);
            if(Patterns.WEB_URL.matcher(((CharSequence)arg4)).matches()) {
                this.zzbz = arg4;
                return;
            }

            StringBuilder v2 = new StringBuilder(String.valueOf(arg4).length() + 51);
            v2.append("The supplied url [ ");
            v2.append(arg4);
            v2.append("] is not match Patterns.WEB_URL!");
            throw new IllegalArgumentException(v2.toString());
        }

        public ProxyRequest build() {
            if(this.zzcc == null) {
                this.zzcc = new byte[0];
            }

            return new ProxyRequest(2, this.zzbz, this.zzca, this.zzcb, this.zzcc, this.zzcd);
        }

        public Builder putHeader(String arg2, String arg3) {
            Preconditions.checkNotEmpty(arg2, "Header name cannot be null or empty!");
            Bundle v0 = this.zzcd;
            if(arg3 == null) {
                arg3 = "";
            }

            v0.putString(arg2, arg3);
            return this;
        }

        public Builder setBody(byte[] arg1) {
            this.zzcc = arg1;
            return this;
        }

        public Builder setHttpMethod(int arg3) {
            boolean v0 = arg3 < 0 || arg3 > ProxyRequest.LAST_CODE ? false : true;
            Preconditions.checkArgument(v0, "Unrecognized http method code.");
            this.zzca = arg3;
            return this;
        }

        public Builder setTimeoutMillis(long arg3) {
            boolean v0 = arg3 >= 0 ? true : false;
            Preconditions.checkArgument(v0, "The specified timeout must be non-negative.");
            this.zzcb = arg3;
            return this;
        }
    }

    public static final Parcelable$Creator CREATOR = null;
    public static final int HTTP_METHOD_DELETE = 0;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 0;
    public static final int HTTP_METHOD_OPTIONS = 0;
    public static final int HTTP_METHOD_PATCH = 0;
    public static final int HTTP_METHOD_POST = 0;
    public static final int HTTP_METHOD_PUT = 0;
    public static final int HTTP_METHOD_TRACE = 0;
    public static final int LAST_CODE = 0;
    public static final int VERSION_CODE = 2;
    @Field(id=4) public final byte[] body;
    @Field(id=2) public final int httpMethod;
    @Field(id=3) public final long timeoutMillis;
    @Field(id=1) public final String url;
    @VersionField(id=1000) private final int versionCode;
    @Field(id=5) private Bundle zzby;

    static {
        ProxyRequest.CREATOR = new zza();
        ProxyRequest.HTTP_METHOD_GET = 0;
        ProxyRequest.HTTP_METHOD_POST = 1;
        ProxyRequest.HTTP_METHOD_PUT = 2;
        ProxyRequest.HTTP_METHOD_DELETE = 3;
        ProxyRequest.HTTP_METHOD_HEAD = 4;
        ProxyRequest.HTTP_METHOD_OPTIONS = 5;
        ProxyRequest.HTTP_METHOD_TRACE = 6;
        ProxyRequest.HTTP_METHOD_PATCH = 7;
        ProxyRequest.LAST_CODE = 7;
    }

    @Constructor ProxyRequest(@Param(id=1000) int arg1, @Param(id=1) String arg2, @Param(id=2) int arg3, @Param(id=3) long arg4, @Param(id=4) byte[] arg6, @Param(id=5) Bundle arg7) {
        super();
        this.versionCode = arg1;
        this.url = arg2;
        this.httpMethod = arg3;
        this.timeoutMillis = arg4;
        this.body = arg6;
        this.zzby = arg7;
    }

    public Map getHeaderMap() {
        LinkedHashMap v0 = new LinkedHashMap(this.zzby.size());
        Iterator v1 = this.zzby.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            ((Map)v0).put(v2, this.zzby.getString(((String)v2)));
        }

        return Collections.unmodifiableMap(((Map)v0));
    }

    public String toString() {
        String v0 = this.url;
        int v1 = this.httpMethod;
        StringBuilder v3 = new StringBuilder(String.valueOf(v0).length() + 42);
        v3.append("ProxyRequest[ url: ");
        v3.append(v0);
        v3.append(", method: ");
        v3.append(v1);
        v3.append(" ]");
        return v3.toString();
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        arg6 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeString(arg5, 1, this.url, false);
        SafeParcelWriter.writeInt(arg5, 2, this.httpMethod);
        SafeParcelWriter.writeLong(arg5, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(arg5, 4, this.body, false);
        SafeParcelWriter.writeBundle(arg5, 5, this.zzby, false);
        SafeParcelWriter.writeInt(arg5, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(arg5, arg6);
    }
}

