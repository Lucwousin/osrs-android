package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@KeepForSdk @Class(creator="StringToIntConverterCreator") public final class StringToIntConverter extends AbstractSafeParcelable implements FieldConverter {
    @Class(creator="StringToIntConverterEntryCreator") public final class zaa extends AbstractSafeParcelable {
        public static final Parcelable$Creator CREATOR;
        @VersionField(id=1) private final int versionCode;
        @Field(id=2) final String zapo;
        @Field(id=3) final int zapp;

        static {
            zaa.CREATOR = new zad();
        }

        @Constructor zaa(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) int arg3) {
            super();
            this.versionCode = arg1;
            this.zapo = arg2;
            this.zapp = arg3;
        }

        zaa(String arg2, int arg3) {
            super();
            this.versionCode = 1;
            this.zapo = arg2;
            this.zapp = arg3;
        }

        public final void writeToParcel(Parcel arg4, int arg5) {
            arg5 = SafeParcelWriter.beginObjectHeader(arg4);
            SafeParcelWriter.writeInt(arg4, 1, this.versionCode);
            SafeParcelWriter.writeString(arg4, 2, this.zapo, false);
            SafeParcelWriter.writeInt(arg4, 3, this.zapp);
            SafeParcelWriter.finishObjectHeader(arg4, arg5);
        }
    }

    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    private final HashMap zapl;
    private final SparseArray zapm;
    @Field(getter="getSerializedMap", id=2) private final ArrayList zapn;

    static {
        StringToIntConverter.CREATOR = new zac();
    }

    @Constructor StringToIntConverter(@Param(id=1) int arg4, @Param(id=2) ArrayList arg5) {
        super();
        this.zale = arg4;
        this.zapl = new HashMap();
        this.zapm = new SparseArray();
        this.zapn = null;
        arg4 = arg5.size();
        int v0 = 0;
        while(v0 < arg4) {
            Object v1 = arg5.get(v0);
            ++v0;
            this.add(((zaa)v1).zapo, ((zaa)v1).zapp);
        }
    }

    @KeepForSdk public StringToIntConverter() {
        super();
        this.zale = 1;
        this.zapl = new HashMap();
        this.zapm = new SparseArray();
        this.zapn = null;
    }

    @KeepForSdk public final StringToIntConverter add(String arg3, int arg4) {
        this.zapl.put(arg3, Integer.valueOf(arg4));
        this.zapm.put(arg4, arg3);
        return this;
    }

    public final Object convert(Object arg2) {
        arg2 = this.zapl.get(arg2);
        if(arg2 == null) {
            arg2 = this.zapl.get("gms_unknown");
        }

        return arg2;
    }

    public final Object convertBack(Object arg3) {
        arg3 = this.zapm.get(((Integer)arg3).intValue());
        if(arg3 == null && (this.zapl.containsKey("gms_unknown"))) {
            return "gms_unknown";
        }

        return arg3;
    }

    public final void writeToParcel(Parcel arg6, int arg7) {
        arg7 = SafeParcelWriter.beginObjectHeader(arg6);
        SafeParcelWriter.writeInt(arg6, 1, this.zale);
        ArrayList v0 = new ArrayList();
        Iterator v1 = this.zapl.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            v0.add(new zaa(((String)v2), this.zapl.get(v2).intValue()));
        }

        SafeParcelWriter.writeTypedList(arg6, 2, ((List)v0), false);
        SafeParcelWriter.finishObjectHeader(arg6, arg7);
    }

    public final int zacj() {
        return 7;
    }

    public final int zack() {
        return 0;
    }
}

