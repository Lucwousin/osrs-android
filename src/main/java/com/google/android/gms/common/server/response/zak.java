package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@ShowFirstParty @Class(creator="FieldMappingDictionaryCreator") public final class zak extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    private final HashMap zaqu;
    @Field(getter="getSerializedDictionary", id=2) private final ArrayList zaqv;
    @Field(getter="getRootClassName", id=3) private final String zaqw;

    static {
        zak.CREATOR = new zan();
    }

    @Constructor zak(@Param(id=1) int arg11, @Param(id=2) ArrayList arg12, @Param(id=3) String arg13) {
        super();
        this.zale = arg11;
        this.zaqv = null;
        HashMap v11 = new HashMap();
        int v0 = arg12.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = arg12.get(v2);
            String v4 = ((zal)v3).className;
            HashMap v5 = new HashMap();
            int v6 = ((zal)v3).zaqx.size();
            int v7;
            for(v7 = 0; v7 < v6; ++v7) {
                Object v8 = ((zal)v3).zaqx.get(v7);
                v5.put(((zam)v8).zaqy, ((zam)v8).zaqz);
            }

            v11.put(v4, v5);
        }

        this.zaqu = v11;
        this.zaqw = Preconditions.checkNotNull(arg13);
        this.zacr();
    }

    public zak(java.lang.Class arg2) {
        super();
        this.zale = 1;
        this.zaqv = null;
        this.zaqu = new HashMap();
        this.zaqw = arg2.getCanonicalName();
    }

    public final String toString() {
        StringBuilder v0 = new StringBuilder();
        Iterator v1 = this.zaqu.keySet().iterator();
    label_5:
        if(v1.hasNext()) {
            Object v2 = v1.next();
            v0.append(((String)v2));
            v0.append(":\n");
            v2 = this.zaqu.get(v2);
            Iterator v3 = ((Map)v2).keySet().iterator();
            while(true) {
                if(!v3.hasNext()) {
                    goto label_5;
                }

                Object v4 = v3.next();
                v0.append("  ");
                v0.append(((String)v4));
                v0.append(": ");
                v0.append(((Map)v2).get(v4));
            }
        }

        return v0.toString();
    }

    public final void writeToParcel(Parcel arg6, int arg7) {
        arg7 = SafeParcelWriter.beginObjectHeader(arg6);
        SafeParcelWriter.writeInt(arg6, 1, this.zale);
        ArrayList v0 = new ArrayList();
        Iterator v1 = this.zaqu.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            v0.add(new zal(((String)v2), this.zaqu.get(v2)));
        }

        SafeParcelWriter.writeTypedList(arg6, 2, ((List)v0), false);
        SafeParcelWriter.writeString(arg6, 3, this.zaqw, false);
        SafeParcelWriter.finishObjectHeader(arg6, arg7);
    }

    public final boolean zaa(java.lang.Class arg2) {
        return this.zaqu.containsKey(arg2.getCanonicalName());
    }

    public final void zaa(java.lang.Class arg2, Map arg3) {
        this.zaqu.put(arg2.getCanonicalName(), arg3);
    }

    public final void zacr() {
        Iterator v0 = this.zaqu.keySet().iterator();
    label_3:
        if(v0.hasNext()) {
            Object v1 = this.zaqu.get(v0.next());
            Iterator v2 = ((Map)v1).keySet().iterator();
            while(true) {
                if(!v2.hasNext()) {
                    goto label_3;
                }

                ((Map)v1).get(v2.next()).zaa(this);
            }
        }
    }

    public final void zacs() {
        Iterator v0 = this.zaqu.keySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            Object v2 = this.zaqu.get(v1);
            HashMap v3 = new HashMap();
            Iterator v4 = ((Map)v2).keySet().iterator();
            while(v4.hasNext()) {
                Object v5 = v4.next();
                v3.put(v5, ((Map)v2).get(v5).zacl());
            }

            this.zaqu.put(v1, v3);
        }
    }

    public final String zact() {
        return this.zaqw;
    }

    public final Map zai(String arg2) {
        return this.zaqu.get(arg2);
    }
}

