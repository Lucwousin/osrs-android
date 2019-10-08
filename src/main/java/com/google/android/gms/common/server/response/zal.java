package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

@ShowFirstParty @Class(creator="FieldMappingDictionaryEntryCreator") public final class zal extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=2) final String className;
    @VersionField(id=1) private final int versionCode;
    @Field(id=3) final ArrayList zaqx;

    static {
        zal.CREATOR = new zao();
    }

    @Constructor zal(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) ArrayList arg3) {
        super();
        this.versionCode = arg1;
        this.className = arg2;
        this.zaqx = arg3;
    }

    zal(String arg5, Map arg6) {
        ArrayList v5;
        super();
        this.versionCode = 1;
        this.className = arg5;
        if(arg6 == null) {
            v5 = null;
        }
        else {
            v5 = new ArrayList();
            Iterator v0 = arg6.keySet().iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                v5.add(new zam(((String)v1), arg6.get(v1)));
            }
        }

        this.zaqx = v5;
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.versionCode);
        SafeParcelWriter.writeString(arg4, 2, this.className, false);
        SafeParcelWriter.writeTypedList(arg4, 3, this.zaqx, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

