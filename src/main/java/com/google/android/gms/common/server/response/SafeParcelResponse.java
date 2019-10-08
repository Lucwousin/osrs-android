package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;

@KeepForSdk @Class(creator="SafeParcelResponseCreator") @VisibleForTesting public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk public static final Parcelable$Creator CREATOR;
    private final String mClassName;
    @VersionField(getter="getVersionCode", id=1) private final int zale;
    @Field(getter="getFieldMappingDictionary", id=3) private final zak zapy;
    @Field(getter="getParcel", id=2) private final Parcel zara;
    private final int zarb;
    private int zarc;
    private int zard;

    static {
        SafeParcelResponse.CREATOR = new zap();
    }

    public SafeParcelResponse(zak arg2, String arg3) {
        super();
        this.zale = 1;
        this.zara = Parcel.obtain();
        this.zarb = 0;
        this.zapy = Preconditions.checkNotNull(arg2);
        this.mClassName = Preconditions.checkNotNull(arg3);
        this.zarc = 0;
    }

    @Constructor SafeParcelResponse(@Param(id=1) int arg1, @Param(id=2) Parcel arg2, @Param(id=3) zak arg3) {
        super();
        this.zale = arg1;
        this.zara = Preconditions.checkNotNull(arg2);
        arg1 = 2;
        this.zarb = arg1;
        this.zapy = arg3;
        this.mClassName = this.zapy == null ? null : this.zapy.zact();
        this.zarc = arg1;
    }

    private SafeParcelResponse(SafeParcelable arg4, zak arg5, String arg6) {
        super();
        this.zale = 1;
        this.zara = Parcel.obtain();
        arg4.writeToParcel(this.zara, 0);
        this.zarb = 1;
        this.zapy = Preconditions.checkNotNull(arg5);
        this.mClassName = Preconditions.checkNotNull(arg6);
        this.zarc = 2;
    }

    public void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        ArrayList v5 = new ArrayList();
        arg6.size();
        int v0 = arg6.size();
        int v1 = 0;
        while(v1 < v0) {
            Object v2 = arg6.get(v1);
            ++v1;
            v5.add(((SafeParcelResponse)v2).zacu());
        }

        SafeParcelWriter.writeParcelList(this.zara, arg4.getSafeParcelableFieldId(), ((List)v5), true);
    }

    public void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, FastJsonResponse arg4) {
        this.zab(arg2);
        SafeParcelWriter.writeParcel(this.zara, arg2.getSafeParcelableFieldId(), ((SafeParcelResponse)arg4).zacu(), true);
    }

    @KeepForSdk public static SafeParcelResponse from(FastJsonResponse arg3) {
        String v0 = arg3.getClass().getCanonicalName();
        zak v1 = new zak(arg3.getClass());
        SafeParcelResponse.zaa(v1, arg3);
        v1.zacs();
        v1.zacr();
        return new SafeParcelResponse(((SafeParcelable)arg3), v1, v0);
    }

    public Map getFieldMappings() {
        if(this.zapy == null) {
            return null;
        }

        return this.zapy.zai(this.mClassName);
    }

    public Object getValueObject(String arg2) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public boolean isPrimitiveFieldSet(String arg2) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    protected void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg1, String arg2, boolean arg3) {
        this.zab(arg1);
        SafeParcelWriter.writeBoolean(this.zara, arg1.getSafeParcelableFieldId(), arg3);
    }

    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, byte[] arg4) {
        this.zab(arg2);
        SafeParcelWriter.writeByteArray(this.zara, arg2.getSafeParcelableFieldId(), arg4, true);
    }

    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg1, String arg2, int arg3) {
        this.zab(arg1);
        SafeParcelWriter.writeInt(this.zara, arg1.getSafeParcelableFieldId(), arg3);
    }

    protected void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg1, String arg2, long arg3) {
        this.zab(arg1);
        SafeParcelWriter.writeLong(this.zara, arg1.getSafeParcelableFieldId(), arg3);
    }

    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, String arg4) {
        this.zab(arg2);
        SafeParcelWriter.writeString(this.zara, arg2.getSafeParcelableFieldId(), arg4, true);
    }

    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        int v5 = arg6.size();
        String[] v0 = new String[v5];
        int v1;
        for(v1 = 0; v1 < v5; ++v1) {
            v0[v1] = arg6.get(v1);
        }

        SafeParcelWriter.writeStringArray(this.zara, arg4.getSafeParcelableFieldId(), v0, true);
    }

    public String toString() {
        Preconditions.checkNotNull(this.zapy, "Cannot convert to JSON on client side.");
        Parcel v0 = this.zacu();
        v0.setDataPosition(0);
        StringBuilder v1 = new StringBuilder(100);
        this.zaa(v1, this.zapy.zai(this.mClassName), v0);
        return v1.toString();
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeParcel(arg5, 2, this.zacu(), false);
        switch(this.zarb) {
            case 0: {
                goto label_25;
            }
            case 1: {
                goto label_23;
            }
            case 2: {
                goto label_21;
            }
        }

        arg6 = this.zarb;
        StringBuilder v1 = new StringBuilder(34);
        v1.append("Invalid creation type: ");
        v1.append(arg6);
        throw new IllegalStateException(v1.toString());
    label_21:
        zak v1_1 = this.zapy;
        goto label_26;
    label_23:
        v1_1 = this.zapy;
        goto label_26;
    label_25:
        Parcelable v1_2 = null;
    label_26:
        SafeParcelWriter.writeParcelable(arg5, 3, v1_2, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    private static void zaa(zak arg3, FastJsonResponse arg4) {
        String v1_1;
        String v0_2;
        java.lang.Class v0 = arg4.getClass();
        if(!arg3.zaa(v0)) {
            Map v4 = arg4.getFieldMappings();
            arg3.zaa(v0, v4);
            Iterator v0_1 = v4.keySet().iterator();
            while(v0_1.hasNext()) {
                Object v1 = v4.get(v0_1.next());
                java.lang.Class v2 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v1).zapw;
                if(v2 != null) {
                    goto label_13;
                }
                else {
                    continue;
                    try {
                    label_13:
                        SafeParcelResponse.zaa(arg3, v2.newInstance());
                        continue;
                    }
                    catch(IllegalAccessException v3) {
                        v0_2 = "Could not access object of type ";
                        v1_1 = String.valueOf(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v1).zapw.getCanonicalName());
                        v0_2 = v1_1.length() != 0 ? v0_2.concat(v1_1) : new String(v0_2);
                        throw new IllegalStateException(v0_2, ((Throwable)v3));
                    }
                    catch(InstantiationException v3_1) {
                        v0_2 = "Could not instantiate an object of type ";
                        v1_1 = String.valueOf(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v1).zapw.getCanonicalName());
                        v0_2 = v1_1.length() != 0 ? v0_2.concat(v1_1) : new String(v0_2);
                        throw new IllegalStateException(v0_2, ((Throwable)v3_1));
                    }
                }

                return;
            }
        }
    }

    private static void zaa(StringBuilder arg1, int arg2, Object arg3) {
        switch(arg2) {
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                goto label_39;
            }
            case 7: {
                goto label_31;
            }
            case 8: {
                goto label_24;
            }
            case 9: {
                goto label_17;
            }
            case 10: {
                goto label_15;
            }
            case 11: {
                goto label_11;
            }
        }

        StringBuilder v0 = new StringBuilder(26);
        v0.append("Unknown type = ");
        v0.append(arg2);
        throw new IllegalArgumentException(v0.toString());
    label_39:
        arg1.append(arg3);
        return;
    label_11:
        throw new IllegalArgumentException("Method does not accept concrete type.");
    label_15:
        MapUtils.writeStringMapToJson(arg1, ((HashMap)arg3));
        return;
    label_17:
        arg1.append("\"");
        arg1.append(Base64Utils.encodeUrlSafe(((byte[])arg3)));
        arg1.append("\"");
        return;
    label_24:
        arg1.append("\"");
        arg1.append(Base64Utils.encode(((byte[])arg3)));
        arg1.append("\"");
        return;
    label_31:
        arg1.append("\"");
        arg1.append(JsonUtils.escapeString(arg3.toString()));
        arg1.append("\"");
    }

    private final void zaa(StringBuilder arg10, Map arg11, Parcel arg12) {
        int v6_1;
        Parcel[] v3_3;
        Iterator v6;
        HashMap v4_1;
        Bundle v3_2;
        Object v5;
        int v4;
        SparseArray v0 = new SparseArray();
        Iterator v11 = arg11.entrySet().iterator();
        while(v11.hasNext()) {
            Object v1 = v11.next();
            v0.put(((Map$Entry)v1).getValue().getSafeParcelableFieldId(), v1);
        }

        arg10.append('{');
        int v11_1 = SafeParcelReader.validateObjectHeader(arg12);
        int v3 = 0;
        do {
        label_17:
            if(arg12.dataPosition() >= v11_1) {
                goto label_250;
            }

            v4 = SafeParcelReader.readHeader(arg12);
            v5 = v0.get(SafeParcelReader.getFieldId(v4));
        }
        while(v5 == null);

        if(v3 != 0) {
            arg10.append(",");
        }

        Object v3_1 = ((Map$Entry)v5).getKey();
        v5 = ((Map$Entry)v5).getValue();
        arg10.append("\"");
        arg10.append(((String)v3_1));
        arg10.append("\":");
        if(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zacn()) {
            switch(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zaps) {
                case 0: {
                    goto label_102;
                }
                case 1: {
                    goto label_98;
                }
                case 2: {
                    goto label_93;
                }
                case 3: {
                    goto label_88;
                }
                case 4: {
                    goto label_83;
                }
                case 5: {
                    goto label_79;
                }
                case 6: {
                    goto label_74;
                }
                case 7: {
                    goto label_70;
                }
                case 8: 
                case 9: {
                    goto label_66;
                }
                case 10: {
                    goto label_52;
                }
                case 11: {
                    goto label_48;
                }
            }

            v11_1 = ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zaps;
            StringBuilder v0_1 = new StringBuilder(36);
            v0_1.append("Unknown field out type = ");
            v0_1.append(v11_1);
            throw new IllegalArgumentException(v0_1.toString());
        label_98:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelReader.createBigInteger(arg12, v4)));
            goto label_248;
        label_66:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelReader.createByteArray(arg12, v4)));
            goto label_248;
        label_102:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), Integer.valueOf(SafeParcelReader.readInt(arg12, v4))));
            goto label_248;
        label_70:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelReader.createString(arg12, v4)));
            goto label_248;
        label_74:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), Boolean.valueOf(SafeParcelReader.readBoolean(arg12, v4))));
            goto label_248;
        label_79:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelReader.createBigDecimal(arg12, v4)));
            goto label_248;
        label_48:
            throw new IllegalArgumentException("Method does not accept concrete type.");
        label_83:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), Double.valueOf(SafeParcelReader.readDouble(arg12, v4))));
            goto label_248;
        label_52:
            v3_2 = SafeParcelReader.createBundle(arg12, v4);
            v4_1 = new HashMap();
            v6 = v3_2.keySet().iterator();
            goto label_57;
        label_88:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), Float.valueOf(SafeParcelReader.readFloat(arg12, v4))));
            goto label_248;
        label_93:
            this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), Long.valueOf(SafeParcelReader.readLong(arg12, v4))));
        }
        else if(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zapt) {
            arg10.append("[");
            switch(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zaps) {
                case 0: {
                    goto label_156;
                }
                case 1: {
                    goto label_153;
                }
                case 2: {
                    goto label_150;
                }
                case 3: {
                    goto label_147;
                }
                case 4: {
                    goto label_144;
                }
                case 5: {
                    goto label_141;
                }
                case 6: {
                    goto label_138;
                }
                case 7: {
                    goto label_135;
                }
                case 8: 
                case 9: 
                case 10: {
                    goto label_131;
                }
                case 11: {
                    goto label_117;
                }
            }

            throw new IllegalStateException("Unknown field type out.");
        label_131:
            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
        label_135:
            ArrayUtils.writeStringArray(arg10, SafeParcelReader.createStringArray(arg12, v4));
            goto label_158;
        label_138:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createBooleanArray(arg12, v4));
            goto label_158;
        label_141:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createBigDecimalArray(arg12, v4));
            goto label_158;
        label_144:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createDoubleArray(arg12, v4));
            goto label_158;
        label_147:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createFloatArray(arg12, v4));
            goto label_158;
        label_117:
            v3_3 = SafeParcelReader.createParcelArray(arg12, v4);
            v4 = v3_3.length;
            v6_1 = 0;
            goto label_120;
        label_150:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createLongArray(arg12, v4));
            goto label_158;
        label_153:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createBigIntegerArray(arg12, v4));
            goto label_158;
        label_156:
            ArrayUtils.writeArray(arg10, SafeParcelReader.createIntArray(arg12, v4));
            goto label_158;
        }
        else {
            switch(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zaps) {
                case 0: {
                    goto label_246;
                }
                case 1: {
                    goto label_243;
                }
                case 2: {
                    goto label_240;
                }
                case 3: {
                    goto label_237;
                }
                case 4: {
                    goto label_234;
                }
                case 5: {
                    goto label_231;
                }
                case 6: {
                    goto label_228;
                }
                case 7: {
                    goto label_220;
                }
                case 8: {
                    goto label_212;
                }
                case 9: {
                    goto label_204;
                }
                case 10: {
                    goto label_172;
                }
                case 11: {
                    goto label_167;
                }
            }

            throw new IllegalStateException("Unknown field type out");
        label_228:
            arg10.append(SafeParcelReader.readBoolean(arg12, v4));
            goto label_248;
        label_231:
            arg10.append(SafeParcelReader.createBigDecimal(arg12, v4));
            goto label_248;
        label_167:
            Parcel v3_4 = SafeParcelReader.createParcel(arg12, v4);
            v3_4.setDataPosition(0);
            this.zaa(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zacq(), v3_4);
            goto label_248;
        label_234:
            arg10.append(SafeParcelReader.readDouble(arg12, v4));
            goto label_248;
        label_204:
            byte[] v3_5 = SafeParcelReader.createByteArray(arg12, v4);
            arg10.append("\"");
            arg10.append(Base64Utils.encodeUrlSafe(v3_5));
            arg10.append("\"");
            goto label_248;
        label_172:
            v3_2 = SafeParcelReader.createBundle(arg12, v4);
            Set v4_2 = v3_2.keySet();
            v4_2.size();
            arg10.append("{");
            Iterator v4_3 = v4_2.iterator();
            int v5_1 = 1;
            goto label_179;
        label_237:
            arg10.append(SafeParcelReader.readFloat(arg12, v4));
            goto label_248;
        label_240:
            arg10.append(SafeParcelReader.readLong(arg12, v4));
            goto label_248;
        label_243:
            arg10.append(SafeParcelReader.createBigInteger(arg12, v4));
            goto label_248;
        label_212:
            v3_5 = SafeParcelReader.createByteArray(arg12, v4);
            arg10.append("\"");
            arg10.append(Base64Utils.encode(v3_5));
            arg10.append("\"");
            goto label_248;
        label_246:
            arg10.append(SafeParcelReader.readInt(arg12, v4));
            goto label_248;
        label_220:
            String v3_6 = SafeParcelReader.createString(arg12, v4);
            arg10.append("\"");
            arg10.append(JsonUtils.escapeString(v3_6));
            arg10.append("\"");
            goto label_248;
        label_250:
            if(arg12.dataPosition() == v11_1) {
                arg10.append('}');
                return;
            }
            else {
                StringBuilder v1_1 = new StringBuilder(37);
                v1_1.append("Overread allowed size end=");
                v1_1.append(v11_1);
                throw new ParseException(v1_1.toString(), arg12);
            label_179:
                while(v4_3.hasNext()) {
                    Object v6_2 = v4_3.next();
                    if(v5_1 == 0) {
                        arg10.append(",");
                    }

                    arg10.append("\"");
                    arg10.append(((String)v6_2));
                    arg10.append("\"");
                    arg10.append(":");
                    arg10.append("\"");
                    arg10.append(JsonUtils.escapeString(v3_2.getString(((String)v6_2))));
                    arg10.append("\"");
                    v5_1 = 0;
                }

                arg10.append("}");
                goto label_248;
            label_120:
                while(v6_1 < v4) {
                    if(v6_1 > 0) {
                        arg10.append(",");
                    }

                    v3_3[v6_1].setDataPosition(0);
                    this.zaa(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5).zacq(), v3_3[v6_1]);
                    ++v6_1;
                }

            label_158:
                arg10.append("]");
                goto label_248;
            label_57:
                while(v6.hasNext()) {
                    Object v7 = v6.next();
                    v4_1.put(v7, v3_2.getString(((String)v7)));
                }

                this.zab(arg10, ((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), SafeParcelResponse.zab(((com.google.android.gms.common.server.response.FastJsonResponse$Field)v5), v4_1));
            }
        }

    label_248:
        v3 = 1;
        goto label_17;
    }

    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field arg1, String arg2, double arg3) {
        this.zab(arg1);
        SafeParcelWriter.writeDouble(this.zara, arg1.getSafeParcelableFieldId(), arg3);
    }

    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field arg1, String arg2, float arg3) {
        this.zab(arg1);
        SafeParcelWriter.writeFloat(this.zara, arg1.getSafeParcelableFieldId(), arg3);
    }

    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, BigDecimal arg4) {
        this.zab(arg2);
        SafeParcelWriter.writeBigDecimal(this.zara, arg2.getSafeParcelableFieldId(), arg4, true);
    }

    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field arg2, String arg3, BigInteger arg4) {
        this.zab(arg2);
        SafeParcelWriter.writeBigInteger(this.zara, arg2.getSafeParcelableFieldId(), arg4, true);
    }

    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        int v5 = arg6.size();
        int[] v0 = new int[v5];
        int v1;
        for(v1 = 0; v1 < v5; ++v1) {
            v0[v1] = arg6.get(v1).intValue();
        }

        SafeParcelWriter.writeIntArray(this.zara, arg4.getSafeParcelableFieldId(), v0, true);
    }

    protected final void zaa(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, Map arg6) {
        this.zab(arg4);
        Bundle v5 = new Bundle();
        Iterator v0 = arg6.keySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            v5.putString(((String)v1), arg6.get(v1));
        }

        SafeParcelWriter.writeBundle(this.zara, arg4.getSafeParcelableFieldId(), v5, true);
    }

    private final void zab(StringBuilder arg5, com.google.android.gms.common.server.response.FastJsonResponse$Field arg6, Object arg7) {
        if(arg6.zapr) {
            arg5.append("[");
            int v0 = ((ArrayList)arg7).size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                if(v1 != 0) {
                    arg5.append(",");
                }

                SafeParcelResponse.zaa(arg5, arg6.zapq, ((ArrayList)arg7).get(v1));
            }

            arg5.append("]");
            return;
        }

        SafeParcelResponse.zaa(arg5, arg6.zapq, arg7);
    }

    private final void zab(com.google.android.gms.common.server.response.FastJsonResponse$Field arg3) {
        int v3 = arg3.zapv != -1 ? 1 : 0;
        if(v3 == 0) {
            goto label_30;
        }

        if(this.zara == null) {
            goto label_26;
        }

        switch(this.zarc) {
            case 0: {
                goto label_21;
            }
            case 1: {
                return;
            }
            case 2: {
                goto label_16;
            }
        }

        throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
        return;
    label_21:
        this.zard = SafeParcelWriter.beginObjectHeader(this.zara);
        this.zarc = 1;
        return;
    label_16:
        throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
    label_26:
        throw new IllegalStateException("Internal Parcel object is null.");
    label_30:
        throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
    }

    protected final void zab(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        int v5 = arg6.size();
        BigInteger[] v0 = new BigInteger[v5];
        int v1;
        for(v1 = 0; v1 < v5; ++v1) {
            v0[v1] = arg6.get(v1);
        }

        SafeParcelWriter.writeBigIntegerArray(this.zara, arg4.getSafeParcelableFieldId(), v0, true);
    }

    protected final void zac(com.google.android.gms.common.server.response.FastJsonResponse$Field arg5, String arg6, ArrayList arg7) {
        this.zab(arg5);
        int v6 = arg7.size();
        long[] v0 = new long[v6];
        int v1;
        for(v1 = 0; v1 < v6; ++v1) {
            v0[v1] = arg7.get(v1).longValue();
        }

        SafeParcelWriter.writeLongArray(this.zara, arg5.getSafeParcelableFieldId(), v0, true);
    }

    private final Parcel zacu() {
        switch(this.zarc) {
            case 0: {
                goto label_3;
            }
            case 1: {
                goto label_6;
            }
        }

        goto label_11;
    label_3:
        this.zard = SafeParcelWriter.beginObjectHeader(this.zara);
    label_6:
        SafeParcelWriter.finishObjectHeader(this.zara, this.zard);
        this.zarc = 2;
    label_11:
        return this.zara;
    }

    protected final void zad(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        int v5 = arg6.size();
        float[] v0 = new float[v5];
        int v1;
        for(v1 = 0; v1 < v5; ++v1) {
            v0[v1] = arg6.get(v1).floatValue();
        }

        SafeParcelWriter.writeFloatArray(this.zara, arg4.getSafeParcelableFieldId(), v0, true);
    }

    protected final void zae(com.google.android.gms.common.server.response.FastJsonResponse$Field arg5, String arg6, ArrayList arg7) {
        this.zab(arg5);
        int v6 = arg7.size();
        double[] v0 = new double[v6];
        int v1;
        for(v1 = 0; v1 < v6; ++v1) {
            v0[v1] = arg7.get(v1).doubleValue();
        }

        SafeParcelWriter.writeDoubleArray(this.zara, arg5.getSafeParcelableFieldId(), v0, true);
    }

    protected final void zaf(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        int v5 = arg6.size();
        BigDecimal[] v0 = new BigDecimal[v5];
        int v1;
        for(v1 = 0; v1 < v5; ++v1) {
            v0[v1] = arg6.get(v1);
        }

        SafeParcelWriter.writeBigDecimalArray(this.zara, arg4.getSafeParcelableFieldId(), v0, true);
    }

    protected final void zag(com.google.android.gms.common.server.response.FastJsonResponse$Field arg4, String arg5, ArrayList arg6) {
        this.zab(arg4);
        int v5 = arg6.size();
        boolean[] v0 = new boolean[v5];
        int v1;
        for(v1 = 0; v1 < v5; ++v1) {
            v0[v1] = arg6.get(v1).booleanValue();
        }

        SafeParcelWriter.writeBooleanArray(this.zara, arg4.getSafeParcelableFieldId(), v0, true);
    }
}

