package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@KeepForSdk @ShowFirstParty public abstract class FastJsonResponse {
    @KeepForSdk @ShowFirstParty @Class(creator="FieldCreator") @VisibleForTesting public class Field extends AbstractSafeParcelable {
        public static final zai CREATOR;
        @VersionField(getter="getVersionCode", id=1) private final int zale;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="getTypeIn", id=2) protected final int zapq;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="isTypeInArray", id=3) protected final boolean zapr;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="getTypeOut", id=4) protected final int zaps;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="isTypeOutArray", id=5) protected final boolean zapt;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="getOutputFieldName", id=6) protected final String zapu;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="getSafeParcelableFieldId", id=7) protected final int zapv;
        protected final java.lang.Class zapw;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="getConcreteTypeName", id=8) private final String zapx;
        private zak zapy;
        @com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field(getter="getWrappedConverter", id=9, type="com.google.android.gms.common.server.converter.ConverterWrapper") private FieldConverter zapz;

        static {
            Field.CREATOR = new zai();
        }

        @Constructor Field(@Param(id=1) int arg1, @Param(id=2) int arg2, @Param(id=3) boolean arg3, @Param(id=4) int arg4, @Param(id=5) boolean arg5, @Param(id=6) String arg6, @Param(id=7) int arg7, @Param(id=8) String arg8, @Param(id=9) zaa arg9) {
            super();
            this.zale = arg1;
            this.zapq = arg2;
            this.zapr = arg3;
            this.zaps = arg4;
            this.zapt = arg5;
            this.zapu = arg6;
            this.zapv = arg7;
            java.lang.Class v1 = null;
            if(arg8 == null) {
                this.zapw = v1;
                this.zapx = ((String)v1);
            }
            else {
                this.zapw = SafeParcelResponse.class;
                this.zapx = arg8;
            }

            if(arg9 == null) {
                this.zapz = ((FieldConverter)v1);
                return;
            }

            this.zapz = arg9.zaci();
        }

        private Field(int arg2, boolean arg3, int arg4, boolean arg5, String arg6, int arg7, java.lang.Class arg8, FieldConverter arg9) {
            super();
            this.zale = 1;
            this.zapq = arg2;
            this.zapr = arg3;
            this.zaps = arg4;
            this.zapt = arg5;
            this.zapu = arg6;
            this.zapv = arg7;
            this.zapw = arg8;
            this.zapx = arg8 == null ? null : arg8.getCanonicalName();
            this.zapz = arg9;
        }

        public final Object convert(Object arg2) {
            return this.zapz.convert(arg2);
        }

        public final Object convertBack(Object arg2) {
            return this.zapz.convertBack(arg2);
        }

        @KeepForSdk @VisibleForTesting public static Field forBase64(String arg10, int arg11) {
            return new Field(8, false, 8, false, arg10, arg11, null, null);
        }

        @KeepForSdk public static Field forBoolean(String arg10, int arg11) {
            return new Field(6, false, 6, false, arg10, arg11, null, null);
        }

        @KeepForSdk public static Field forConcreteType(String arg10, int arg11, java.lang.Class arg12) {
            return new Field(11, false, 11, false, arg10, arg11, arg12, null);
        }

        @KeepForSdk public static Field forConcreteTypeArray(String arg10, int arg11, java.lang.Class arg12) {
            return new Field(11, true, 11, true, arg10, arg11, arg12, null);
        }

        @KeepForSdk public static Field forDouble(String arg10, int arg11) {
            return new Field(4, false, 4, false, arg10, arg11, null, null);
        }

        @KeepForSdk public static Field forFloat(String arg10, int arg11) {
            return new Field(3, false, 3, false, arg10, arg11, null, null);
        }

        @KeepForSdk @VisibleForTesting public static Field forInteger(String arg10, int arg11) {
            return new Field(0, false, 0, false, arg10, arg11, null, null);
        }

        @KeepForSdk public static Field forLong(String arg10, int arg11) {
            return new Field(2, false, 2, false, arg10, arg11, null, null);
        }

        @KeepForSdk public static Field forString(String arg10, int arg11) {
            return new Field(7, false, 7, false, arg10, arg11, null, null);
        }

        @KeepForSdk public static Field forStrings(String arg10, int arg11) {
            return new Field(7, true, 7, true, arg10, arg11, null, null);
        }

        @KeepForSdk public int getSafeParcelableFieldId() {
            return this.zapv;
        }

        public String toString() {
            ToStringHelper v0 = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zale)).add("typeIn", Integer.valueOf(this.zapq)).add("typeInArray", Boolean.valueOf(this.zapr)).add("typeOut", Integer.valueOf(this.zaps)).add("typeOutArray", Boolean.valueOf(this.zapt)).add("outputFieldName", this.zapu).add("safeParcelFieldId", Integer.valueOf(this.zapv)).add("concreteTypeName", this.zacm());
            java.lang.Class v1 = this.zapw;
            if(v1 != null) {
                v0.add("concreteType.class", v1.getCanonicalName());
            }

            if(this.zapz != null) {
                v0.add("converterName", this.zapz.getClass().getCanonicalName());
            }

            return v0.toString();
        }

        @KeepForSdk public static Field withConverter(String arg10, int arg11, FieldConverter arg12, boolean arg13) {
            return new Field(arg12.zacj(), arg13, arg12.zack(), false, arg10, arg11, null, arg12);
        }

        public void writeToParcel(Parcel arg5, int arg6) {
            int v0 = SafeParcelWriter.beginObjectHeader(arg5);
            SafeParcelWriter.writeInt(arg5, 1, this.zale);
            SafeParcelWriter.writeInt(arg5, 2, this.zapq);
            SafeParcelWriter.writeBoolean(arg5, 3, this.zapr);
            SafeParcelWriter.writeInt(arg5, 4, this.zaps);
            SafeParcelWriter.writeBoolean(arg5, 5, this.zapt);
            SafeParcelWriter.writeString(arg5, 6, this.zapu, false);
            SafeParcelWriter.writeInt(arg5, 7, this.getSafeParcelableFieldId());
            SafeParcelWriter.writeString(arg5, 8, this.zacm(), false);
            SafeParcelWriter.writeParcelable(arg5, 9, this.zaco(), arg6, false);
            SafeParcelWriter.finishObjectHeader(arg5, v0);
        }

        static FieldConverter zaa(Field arg0) {
            return arg0.zapz;
        }

        public final void zaa(zak arg1) {
            this.zapy = arg1;
        }

        public final Field zacl() {
            return new Field(this.zale, this.zapq, this.zapr, this.zaps, this.zapt, this.zapu, this.zapv, this.zapx, this.zaco());
        }

        private final String zacm() {
            if(this.zapx == null) {
                return null;
            }

            return this.zapx;
        }

        public final boolean zacn() {
            if(this.zapz != null) {
                return 1;
            }

            return 0;
        }

        private final zaa zaco() {
            if(this.zapz == null) {
                return null;
            }

            return zaa.zaa(this.zapz);
        }

        public final FastJsonResponse zacp() throws InstantiationException, IllegalAccessException {
            if(this.zapw == SafeParcelResponse.class) {
                Preconditions.checkNotNull(this.zapy, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
                return new SafeParcelResponse(this.zapy, this.zapx);
            }

            return this.zapw.newInstance();
        }

        public final Map zacq() {
            Preconditions.checkNotNull(this.zapx);
            Preconditions.checkNotNull(this.zapy);
            return this.zapy.zai(this.zapx);
        }
    }

    @ShowFirstParty public interface FieldConverter {
        Object convert(Object arg1);

        Object convertBack(Object arg1);

        int zacj();

        int zack();
    }

    public FastJsonResponse() {
        super();
    }

    @KeepForSdk public void addConcreteTypeArrayInternal(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk public void addConcreteTypeInternal(Field arg1, String arg2, FastJsonResponse arg3) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @KeepForSdk public abstract Map getFieldMappings();

    @KeepForSdk protected Object getFieldValue(Field arg8) {
        String v0 = arg8.zapu;
        if(arg8.zapw != null) {
            boolean v1 = this.getValueObject(arg8.zapu) == null ? true : false;
            Preconditions.checkState(v1, "Concrete field shouldn\'t be value object: %s", new Object[]{arg8.zapu});
            try {
                char v8_1 = Character.toUpperCase(v0.charAt(0));
                v0 = v0.substring(1);
                StringBuilder v2 = new StringBuilder(String.valueOf(v0).length() + 4);
                v2.append("get");
                v2.append(v8_1);
                v2.append(v0);
                return this.getClass().getMethod(v2.toString()).invoke(this);
            }
            catch(Exception v8) {
                throw new RuntimeException(((Throwable)v8));
            }
        }

        return this.getValueObject(arg8.zapu);
    }

    @KeepForSdk protected abstract Object getValueObject(String arg1);

    @KeepForSdk protected boolean isFieldSet(Field arg3) {
        if(arg3.zaps == 11) {
            if(arg3.zapt) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }

            throw new UnsupportedOperationException("Concrete types not supported");
        }

        return this.isPrimitiveFieldSet(arg3.zapu);
    }

    @KeepForSdk protected abstract boolean isPrimitiveFieldSet(String arg1);

    @KeepForSdk protected void setBooleanInternal(Field arg1, String arg2, boolean arg3) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk protected void setDecodedBytesInternal(Field arg1, String arg2, byte[] arg3) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk protected void setIntegerInternal(Field arg1, String arg2, int arg3) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk protected void setLongInternal(Field arg1, String arg2, long arg3) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk protected void setStringInternal(Field arg1, String arg2, String arg3) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk protected void setStringsInternal(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @KeepForSdk public String toString() {
        int v3_1;
        Object v5;
        Object v4;
        Map v0 = this.getFieldMappings();
        StringBuilder v1 = new StringBuilder(100);
        Iterator v2 = v0.keySet().iterator();
    label_6:
        while(v2.hasNext()) {
            Object v3 = v2.next();
            v4 = v0.get(v3);
            if(!this.isFieldSet(((Field)v4))) {
                continue;
            }

            v5 = FastJsonResponse.zab(((Field)v4), this.getFieldValue(((Field)v4)));
            if(v1.length() == 0) {
                v1.append("{");
            }
            else {
                v1.append(",");
            }

            v1.append("\"");
            v1.append(((String)v3));
            v1.append("\":");
            if(v5 == null) {
                v1.append("null");
                continue;
            }

            switch(((Field)v4).zaps) {
                case 8: {
                    goto label_48;
                }
                case 9: {
                    goto label_41;
                }
                case 10: {
                    goto label_39;
                }
            }

            if(((Field)v4).zapr) {
                v1.append("[");
                v3_1 = 0;
                int v6 = ((ArrayList)v5).size();
                goto label_55;
            }

            FastJsonResponse.zaa(v1, ((Field)v4), v5);
            continue;
        label_39:
            MapUtils.writeStringMapToJson(v1, ((HashMap)v5));
            continue;
        label_41:
            v1.append("\"");
            v1.append(Base64Utils.encodeUrlSafe(((byte[])v5)));
            v1.append("\"");
            continue;
        label_48:
            v1.append("\"");
            v1.append(Base64Utils.encode(((byte[])v5)));
            v1.append("\"");
        }

        if(v1.length() > 0) {
            v1.append("}");
        }
        else {
            v1.append("{}");
        }

        return v1.toString();
    label_55:
        while(v3_1 < v6) {
            if(v3_1 > 0) {
                v1.append(",");
            }

            Object v7 = ((ArrayList)v5).get(v3_1);
            if(v7 != null) {
                FastJsonResponse.zaa(v1, ((Field)v4), v7);
            }

            ++v3_1;
        }

        v1.append("]");
        goto label_6;
    }

    private final void zaa(Field arg4, Object arg5) {
        String v0 = arg4.zapu;
        arg5 = arg4.convert(arg5);
        switch(arg4.zaps) {
            case 0: {
                goto label_40;
            }
            case 1: {
                goto label_38;
            }
            case 2: {
                goto label_33;
            }
            case 4: {
                goto label_28;
            }
            case 5: {
                goto label_26;
            }
            case 6: {
                goto label_21;
            }
            case 7: {
                goto label_19;
            }
            case 8: 
            case 9: {
                goto label_15;
            }
        }

        int v4 = arg4.zaps;
        StringBuilder v1 = new StringBuilder(44);
        v1.append("Unsupported type for conversion: ");
        v1.append(v4);
        throw new IllegalStateException(v1.toString());
    label_33:
        if(!FastJsonResponse.zaa(v0, arg5)) {
            return;
        }

        this.setLongInternal(arg4, v0, ((Long)arg5).longValue());
        return;
    label_19:
        this.setStringInternal(arg4, v0, ((String)arg5));
        return;
    label_21:
        if(!FastJsonResponse.zaa(v0, arg5)) {
            return;
        }

        this.setBooleanInternal(arg4, v0, ((Boolean)arg5).booleanValue());
        return;
    label_38:
        this.zaa(arg4, v0, ((BigInteger)arg5));
        return;
    label_40:
        if(!FastJsonResponse.zaa(v0, arg5)) {
            return;
        }

        this.setIntegerInternal(arg4, v0, ((Integer)arg5).intValue());
        return;
    label_26:
        this.zaa(arg4, v0, ((BigDecimal)arg5));
        return;
    label_28:
        if(!FastJsonResponse.zaa(v0, arg5)) {
            return;
        }

        this.zaa(arg4, v0, ((Double)arg5).doubleValue());
        return;
    label_15:
        if(FastJsonResponse.zaa(v0, arg5)) {
            this.setDecodedBytesInternal(arg4, v0, ((byte[])arg5));
            return;
        }
    }

    private static boolean zaa(String arg2, Object arg3) {
        if(arg3 == null) {
            if(Log.isLoggable("FastJsonResponse", 6)) {
                StringBuilder v1 = new StringBuilder(String.valueOf(arg2).length() + 58);
                v1.append("Output field (");
                v1.append(arg2);
                v1.append(") has a null value, but expected a primitive");
                Log.e("FastJsonResponse", v1.toString());
            }

            return 0;
        }

        return 1;
    }

    protected void zaa(Field arg1, String arg2, BigInteger arg3) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    protected void zaa(Field arg1, String arg2, BigDecimal arg3) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    protected void zaa(Field arg1, String arg2, double arg3) {
        throw new UnsupportedOperationException("Double not supported");
    }

    private static void zaa(StringBuilder arg2, Field arg3, Object arg4) {
        if(arg3.zapq == 11) {
            arg2.append(arg3.zapw.cast(arg4).toString());
            return;
        }

        if(arg3.zapq == 7) {
            arg2.append("\"");
            arg2.append(JsonUtils.escapeString(((String)arg4)));
            arg2.append("\"");
            return;
        }

        arg2.append(arg4);
    }

    public final void zaa(Field arg2, double arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, Double.valueOf(arg3));
            return;
        }

        this.zaa(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, float arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, Float.valueOf(arg3));
            return;
        }

        this.zaa(arg2, arg2.zapu, arg3);
    }

    protected void zaa(Field arg1, String arg2, float arg3) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zaa(Field arg2, int arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, Integer.valueOf(arg3));
            return;
        }

        this.setIntegerInternal(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, long arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, Long.valueOf(arg3));
            return;
        }

        this.setLongInternal(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, String arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.setStringInternal(arg2, arg2.zapu, arg3);
    }

    protected void zaa(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    protected void zaa(Field arg1, String arg2, Map arg3) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public final void zaa(Field arg2, BigDecimal arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zaa(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, BigInteger arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zaa(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zaa(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, Map arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zaa(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, boolean arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, Boolean.valueOf(arg3));
            return;
        }

        this.setBooleanInternal(arg2, arg2.zapu, arg3);
    }

    public final void zaa(Field arg2, byte[] arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.setDecodedBytesInternal(arg2, arg2.zapu, arg3);
    }

    protected static Object zab(Field arg1, Object arg2) {
        if(Field.zaa(arg1) != null) {
            return arg1.convertBack(arg2);
        }

        return arg2;
    }

    protected void zab(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zab(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zab(arg2, arg2.zapu, arg3);
    }

    protected void zac(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public final void zac(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zac(arg2, arg2.zapu, arg3);
    }

    protected void zad(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zad(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zad(arg2, arg2.zapu, arg3);
    }

    protected void zae(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zae(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zae(arg2, arg2.zapu, arg3);
    }

    protected void zaf(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zaf(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zaf(arg2, arg2.zapu, arg3);
    }

    protected void zag(Field arg1, String arg2, ArrayList arg3) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zag(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.zag(arg2, arg2.zapu, arg3);
    }

    public final void zah(Field arg2, ArrayList arg3) {
        if(Field.zaa(arg2) != null) {
            this.zaa(arg2, arg3);
            return;
        }

        this.setStringsInternal(arg2, arg2.zapu, arg3);
    }
}

