package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;

@KeepForSdk @KeepName @Class(creator="DataHolderCreator", validate=true) public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk public class Builder {
        private final String[] zalp;
        private final ArrayList zaly;
        private final String zalz;
        private final HashMap zama;
        private boolean zamb;
        private String zamc;

        Builder(String[] arg1, String arg2, zab arg3) {
            this(arg1, null);
        }

        private Builder(String[] arg1, String arg2) {
            super();
            this.zalp = Preconditions.checkNotNull(arg1);
            this.zaly = new ArrayList();
            this.zalz = arg2;
            this.zama = new HashMap();
            this.zamb = false;
            this.zamc = null;
        }

        @KeepForSdk public DataHolder build(int arg3) {
            return new DataHolder(this, arg3, null, null);
        }

        @KeepForSdk public DataHolder build(int arg8, Bundle arg9) {
            return new DataHolder(this, arg8, arg9, -1, null);
        }

        @KeepForSdk public Builder withRow(ContentValues arg4) {
            Asserts.checkNotNull(arg4);
            HashMap v0 = new HashMap(arg4.size());
            Iterator v4 = arg4.valueSet().iterator();
            while(v4.hasNext()) {
                Object v1 = v4.next();
                v0.put(((Map$Entry)v1).getKey(), ((Map$Entry)v1).getValue());
            }

            return this.zaa(v0);
        }

        static String[] zaa(Builder arg0) {
            return arg0.zalp;
        }

        public Builder zaa(HashMap arg5) {
            int v0_1;
            Object v2;
            Asserts.checkNotNull(arg5);
            int v1 = -1;
            if(this.zalz != null) {
                Object v0 = arg5.get(this.zalz);
                if(v0 == null) {
                    goto label_4;
                }
                else {
                    v2 = this.zama.get(v0);
                    if(v2 == null) {
                        this.zama.put(v0, Integer.valueOf(this.zaly.size()));
                        goto label_4;
                    }
                    else {
                        goto label_19;
                    }
                }
            }
            else {
            label_4:
                v0_1 = -1;
                goto label_20;
            label_19:
                v0_1 = ((Integer)v2).intValue();
            }

        label_20:
            if(v0_1 == v1) {
                this.zaly.add(arg5);
            }
            else {
                this.zaly.remove(v0_1);
                this.zaly.add(v0_1, arg5);
            }

            this.zamb = false;
            return this;
        }

        static ArrayList zab(Builder arg0) {
            return arg0.zaly;
        }
    }

    public final class zaa extends RuntimeException {
        public zaa(String arg1) {
            super(arg1);
        }
    }

    @KeepForSdk public static final Parcelable$Creator CREATOR;
    private boolean mClosed;
    @VersionField(id=1000) private final int zale;
    @Field(getter="getColumns", id=1) private final String[] zalp;
    private Bundle zalq;
    @Field(getter="getWindows", id=2) private final CursorWindow[] zalr;
    @Field(getter="getStatusCode", id=3) private final int zals;
    @Field(getter="getMetadata", id=4) private final Bundle zalt;
    private int[] zalu;
    private int zalv;
    private boolean zalw;
    private static final Builder zalx;

    static {
        DataHolder.CREATOR = new zac();
        DataHolder.zalx = new zab(new String[0], null);
    }

    @Constructor DataHolder(@Param(id=1000) int arg2, @Param(id=1) String[] arg3, @Param(id=2) CursorWindow[] arg4, @Param(id=3) int arg5, @Param(id=4) Bundle arg6) {
        super();
        this.mClosed = false;
        this.zalw = true;
        this.zale = arg2;
        this.zalp = arg3;
        this.zalr = arg4;
        this.zals = arg5;
        this.zalt = arg6;
    }

    @KeepForSdk public DataHolder(Cursor arg2, int arg3, Bundle arg4) {
        this(new CursorWrapper(arg2), arg3, arg4);
    }

    private DataHolder(CursorWrapper arg2, int arg3, Bundle arg4) {
        this(arg2.getColumnNames(), DataHolder.zaa(arg2), arg3, arg4);
    }

    private DataHolder(Builder arg2, int arg3, Bundle arg4) {
        this(Builder.zaa(arg2), DataHolder.zaa(arg2, -1), arg3, null);
    }

    @KeepForSdk public DataHolder(String[] arg2, CursorWindow[] arg3, int arg4, Bundle arg5) {
        super();
        this.mClosed = false;
        this.zalw = true;
        this.zale = 1;
        this.zalp = Preconditions.checkNotNull(arg2);
        this.zalr = Preconditions.checkNotNull(arg3);
        this.zals = arg4;
        this.zalt = arg5;
        this.zaca();
    }

    private DataHolder(Builder arg2, int arg3, Bundle arg4, int arg5) {
        this(Builder.zaa(arg2), DataHolder.zaa(arg2, -1), arg3, arg4);
    }

    DataHolder(Builder arg1, int arg2, Bundle arg3, int arg4, zab arg5) {
        this(arg1, arg2, arg3, -1);
    }

    DataHolder(Builder arg1, int arg2, Bundle arg3, zab arg4) {
        this(arg1, arg2, null);
    }

    @KeepForSdk public static Builder builder(String[] arg2) {
        return new Builder(arg2, null, null);
    }

    @KeepForSdk public final void close() {
        __monitor_enter(this);
        try {
            if(!this.mClosed) {
                this.mClosed = true;
                int v0_1;
                for(v0_1 = 0; v0_1 < this.zalr.length; ++v0_1) {
                    this.zalr[v0_1].close();
                }
            }

            __monitor_exit(this);
            return;
        label_17:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_17;
        }

        throw v0;
    }

    @KeepForSdk public static DataHolder empty(int arg3) {
        return new DataHolder(DataHolder.zalx, arg3, null);
    }

    protected final void finalize() throws Throwable {
        try {
            if((this.zalw) && this.zalr.length > 0 && !this.isClosed()) {
                this.close();
                String v1 = this.toString();
                StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 0xB2);
                v3.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                v3.append(v1);
                v3.append(")");
                Log.e("DataBuffer", v3.toString());
            }
        }
        catch(Throwable v0) {
            super.finalize();
            throw v0;
        }

        super.finalize();
    }

    @KeepForSdk public final boolean getBoolean(String arg3, int arg4, int arg5) {
        this.zaa(arg3, arg4);
        if(Long.valueOf(this.zalr[arg5].getLong(arg4, this.zalq.getInt(arg3))).longValue() == 1) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public final byte[] getByteArray(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].getBlob(arg3, this.zalq.getInt(arg2));
    }

    @KeepForSdk public final int getCount() {
        return this.zalv;
    }

    @KeepForSdk public final int getInteger(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].getInt(arg3, this.zalq.getInt(arg2));
    }

    @KeepForSdk public final long getLong(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].getLong(arg3, this.zalq.getInt(arg2));
    }

    @KeepForSdk public final Bundle getMetadata() {
        return this.zalt;
    }

    @KeepForSdk public final int getStatusCode() {
        return this.zals;
    }

    @KeepForSdk public final String getString(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].getString(arg3, this.zalq.getInt(arg2));
    }

    @KeepForSdk public final int getWindowIndex(int arg3) {
        int v0 = 0;
        boolean v1 = arg3 < 0 || arg3 >= this.zalv ? false : true;
        Preconditions.checkState(v1);
        while(v0 < this.zalu.length) {
            if(arg3 < this.zalu[v0]) {
                --v0;
            }
            else {
                ++v0;
                continue;
            }

            break;
        }

        if(v0 == this.zalu.length) {
            --v0;
        }

        return v0;
    }

    @KeepForSdk public final boolean hasColumn(String arg2) {
        return this.zalq.containsKey(arg2);
    }

    @KeepForSdk public final boolean hasNull(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].isNull(arg3, this.zalq.getInt(arg2));
    }

    @KeepForSdk public final boolean isClosed() {
        __monitor_enter(this);
        try {
            __monitor_exit(this);
            return this.mClosed;
        label_5:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_5;
        }

        throw v0;
    }

    public final void writeToParcel(Parcel arg6, int arg7) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg6);
        SafeParcelWriter.writeStringArray(arg6, 1, this.zalp, false);
        SafeParcelWriter.writeTypedArray(arg6, 2, this.zalr, arg7, false);
        SafeParcelWriter.writeInt(arg6, 3, this.getStatusCode());
        SafeParcelWriter.writeBundle(arg6, 4, this.getMetadata(), false);
        SafeParcelWriter.writeInt(arg6, 1000, this.zale);
        SafeParcelWriter.finishObjectHeader(arg6, v0);
        if((arg7 & 1) != 0) {
            this.close();
        }
    }

    public final void zaa(String arg2, int arg3, int arg4, CharArrayBuffer arg5) {
        this.zaa(arg2, arg3);
        this.zalr[arg4].copyStringToBuffer(arg3, this.zalq.getInt(arg2), arg5);
    }

    public final float zaa(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].getFloat(arg3, this.zalq.getInt(arg2));
    }

    private static CursorWindow[] zaa(Builder arg12, int arg13) {
        Object v10;
        String v9_1;
        ArrayList v13_1;
        int v1 = 0;
        if(Builder.zaa(arg12).length == 0) {
            return new CursorWindow[0];
        }

        if(arg13 < 0 || arg13 >= Builder.zab(arg12).size()) {
            v13_1 = Builder.zab(arg12);
        }
        else {
            List v13 = Builder.zab(arg12).subList(0, arg13);
        }

        int v0 = ((List)v13_1).size();
        CursorWindow v2 = new CursorWindow(false);
        ArrayList v3 = new ArrayList();
        v3.add(v2);
        v2.setNumColumns(Builder.zaa(arg12).length);
        CursorWindow v4 = v2;
        int v2_1 = 0;
        int v5 = 0;
        while(true) {
            if(v2_1 >= v0) {
                goto label_170;
            }

            try {
                if(!v4.allocRow()) {
                    StringBuilder v7 = new StringBuilder(72);
                    v7.append("Allocating additional cursor window for large data set (row ");
                    v7.append(v2_1);
                    v7.append(")");
                    Log.d("DataHolder", v7.toString());
                    v4 = new CursorWindow(false);
                    v4.setStartPosition(v2_1);
                    v4.setNumColumns(Builder.zaa(arg12).length);
                    v3.add(v4);
                    if(!v4.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        v3.remove(v4);
                        return v3.toArray(new CursorWindow[v3.size()]);
                    }
                }

                Object v6 = ((List)v13_1).get(v2_1);
                int v8 = 0;
                boolean v9 = true;
                while(true) {
                    if(v8 < Builder.zaa(arg12).length && (v9)) {
                        v9_1 = Builder.zaa(arg12)[v8];
                        v10 = ((Map)v6).get(v9_1);
                        if(v10 == null) {
                            v9 = v4.putNull(v2_1, v8);
                        }
                        else if((v10 instanceof String)) {
                            v9 = v4.putString(((String)v10), v2_1, v8);
                        }
                        else if((v10 instanceof Long)) {
                            v9 = v4.putLong(((Long)v10).longValue(), v2_1, v8);
                        }
                        else if((v10 instanceof Integer)) {
                            v9 = v4.putLong(((long)((Integer)v10).intValue()), v2_1, v8);
                        }
                        else if((v10 instanceof Boolean)) {
                            long v9_2 = ((Boolean)v10).booleanValue() ? 1 : 0;
                            v9 = v4.putLong(v9_2, v2_1, v8);
                        }
                        else {
                            if((v10 instanceof byte[])) {
                                v9 = v4.putBlob(((byte[])v10), v2_1, v8);
                                goto label_110;
                            }

                            if((v10 instanceof Double)) {
                                v9 = v4.putDouble(((Double)v10).doubleValue(), v2_1, v8);
                                goto label_110;
                            }

                            if(!(v10 instanceof Float)) {
                                break;
                            }

                            v9 = v4.putDouble(((double)((Float)v10).floatValue()), v2_1, v8);
                        }

                    label_110:
                        ++v8;
                        continue;
                    }

                    goto label_131;
                }

                String v13_2 = String.valueOf(v10);
                StringBuilder v2_2 = new StringBuilder(String.valueOf(v9_1).length() + 0x20 + String.valueOf(v13_2).length());
                v2_2.append("Unsupported object for column ");
                v2_2.append(v9_1);
                v2_2.append(": ");
                v2_2.append(v13_2);
                throw new IllegalArgumentException(v2_2.toString());
            label_131:
                if(v9) {
                    goto label_159;
                }
                else if(v5 == 0) {
                    StringBuilder v8_1 = new StringBuilder(74);
                    v8_1.append("Couldn\'t populate window data for row ");
                    v8_1.append(v2_1);
                    v8_1.append(" - allocating new window.");
                    Log.d("DataHolder", v8_1.toString());
                    v4.freeLastRow();
                    v4 = new CursorWindow(false);
                    v4.setStartPosition(v2_1);
                    v4.setNumColumns(Builder.zaa(arg12).length);
                    v3.add(v4);
                    --v2_1;
                    v5 = 1;
                }
                else {
                    throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }

                goto label_160;
            }
            catch(RuntimeException v12) {
                break;
            }

        label_159:
            v5 = 0;
        label_160:
            ++v2_1;
        }

        arg13 = v3.size();
        while(v1 < arg13) {
            v3.get(v1).close();
            ++v1;
        }

        throw v12;
    label_170:
        return v3.toArray(new CursorWindow[v3.size()]);
    }

    private static CursorWindow[] zaa(CursorWrapper arg6) {
        int v2_1;
        ArrayList v0 = new ArrayList();
        try {
            int v1 = arg6.getCount();
            CursorWindow v2 = arg6.getWindow();
            CursorWindow v3 = null;
            if(v2 == null || v2.getStartPosition() != 0) {
                v2_1 = 0;
            }
            else {
                v2.acquireReference();
                arg6.setWindow(v3);
                v0.add(v2);
                v2_1 = v2.getNumRows();
            }

            while(v2_1 < v1) {
                if(!arg6.moveToPosition(v2_1)) {
                    break;
                }

                CursorWindow v5 = arg6.getWindow();
                if(v5 != null) {
                    v5.acquireReference();
                    arg6.setWindow(v3);
                }
                else {
                    v5 = new CursorWindow(false);
                    v5.setStartPosition(v2_1);
                    arg6.fillWindow(v2_1, v5);
                }

                if(v5.getNumRows() == 0) {
                    break;
                }

                v0.add(v5);
                v2_1 = v5.getStartPosition() + v5.getNumRows();
            }
        }
        catch(Throwable v0_1) {
            goto label_40;
        }

        arg6.close();
        return v0.toArray(new CursorWindow[v0.size()]);
    label_40:
        arg6.close();
        throw v0_1;
    }

    private final void zaa(String arg3, int arg4) {
        if(this.zalq != null) {
            if(!this.zalq.containsKey(arg3)) {
            }
            else if(!this.isClosed()) {
                if(arg4 >= 0 && arg4 < this.zalv) {
                    return;
                }

                throw new CursorIndexOutOfBoundsException(arg4, this.zalv);
            }
            else {
                throw new IllegalArgumentException("Buffer is closed.");
            }
        }

        String v0 = "No such column: ";
        arg3 = String.valueOf(arg3);
        arg3 = arg3.length() != 0 ? v0.concat(arg3) : new String(v0);
        throw new IllegalArgumentException(arg3);
    }

    public final double zab(String arg2, int arg3, int arg4) {
        this.zaa(arg2, arg3);
        return this.zalr[arg4].getDouble(arg3, this.zalq.getInt(arg2));
    }

    public final void zaca() {
        this.zalq = new Bundle();
        int v0 = 0;
        int v1;
        for(v1 = 0; v1 < this.zalp.length; ++v1) {
            this.zalq.putInt(this.zalp[v1], v1);
        }

        this.zalu = new int[this.zalr.length];
        v1 = 0;
        while(v0 < this.zalr.length) {
            this.zalu[v0] = v1;
            v1 += this.zalr[v0].getNumRows() - (v1 - this.zalr[v0].getStartPosition());
            ++v0;
        }

        this.zalv = v1;
    }
}

