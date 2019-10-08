package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

@RestrictTo(value={Scope.LIBRARY}) class VersionedParcelStream extends VersionedParcel {
    class FieldBuffer {
        final DataOutputStream mDataStream;
        private final int mFieldId;
        final ByteArrayOutputStream mOutput;
        private final DataOutputStream mTarget;

        FieldBuffer(int arg3, DataOutputStream arg4) {
            super();
            this.mOutput = new ByteArrayOutputStream();
            this.mDataStream = new DataOutputStream(this.mOutput);
            this.mFieldId = arg3;
            this.mTarget = arg4;
        }

        void flushField() throws IOException {
            this.mDataStream.flush();
            int v0 = this.mOutput.size();
            int v1 = this.mFieldId << 16;
            int v2 = 0xFFFF;
            int v3 = v0 >= v2 ? 0xFFFF : v0;
            this.mTarget.writeInt(v1 | v3);
            if(v0 >= v2) {
                this.mTarget.writeInt(v0);
            }

            this.mOutput.writeTo(this.mTarget);
        }
    }

    class InputBuffer {
        final int mFieldId;
        final DataInputStream mInputStream;
        private final int mSize;

        InputBuffer(int arg1, int arg2, DataInputStream arg3) throws IOException {
            super();
            this.mSize = arg2;
            this.mFieldId = arg1;
            byte[] v1 = new byte[this.mSize];
            arg3.readFully(v1);
            this.mInputStream = new DataInputStream(new ByteArrayInputStream(v1));
        }
    }

    private static final int TYPE_BOOLEAN = 5;
    private static final int TYPE_BOOLEAN_ARRAY = 6;
    private static final int TYPE_DOUBLE = 7;
    private static final int TYPE_DOUBLE_ARRAY = 8;
    private static final int TYPE_FLOAT = 13;
    private static final int TYPE_FLOAT_ARRAY = 14;
    private static final int TYPE_INT = 9;
    private static final int TYPE_INT_ARRAY = 10;
    private static final int TYPE_LONG = 11;
    private static final int TYPE_LONG_ARRAY = 12;
    private static final int TYPE_NULL = 0;
    private static final int TYPE_STRING = 3;
    private static final int TYPE_STRING_ARRAY = 4;
    private static final int TYPE_SUB_BUNDLE = 1;
    private static final int TYPE_SUB_PERSISTABLE_BUNDLE = 2;
    private static final Charset UTF_16;
    private final SparseArray mCachedFields;
    private DataInputStream mCurrentInput;
    private DataOutputStream mCurrentOutput;
    private FieldBuffer mFieldBuffer;
    private boolean mIgnoreParcelables;
    private final DataInputStream mMasterInput;
    private final DataOutputStream mMasterOutput;

    static {
        VersionedParcelStream.UTF_16 = Charset.forName("UTF-16");
    }

    public VersionedParcelStream(InputStream arg3, OutputStream arg4) {
        super();
        this.mCachedFields = new SparseArray();
        DataOutputStream v0 = null;
        DataInputStream v1 = arg3 != null ? new DataInputStream(arg3) : ((DataInputStream)v0);
        this.mMasterInput = v1;
        if(arg4 != null) {
            v0 = new DataOutputStream(arg4);
        }

        this.mMasterOutput = v0;
        this.mCurrentInput = this.mMasterInput;
        this.mCurrentOutput = this.mMasterOutput;
    }

    public void closeField() {
        if(this.mFieldBuffer != null) {
            try {
                if(this.mFieldBuffer.mOutput.size() != 0) {
                    this.mFieldBuffer.flushField();
                }
            }
            catch(IOException v0) {
                throw new ParcelException(((Throwable)v0));
            }

            this.mFieldBuffer = null;
        }
    }

    protected VersionedParcel createSubParcel() {
        return new VersionedParcelStream(this.mCurrentInput, this.mCurrentOutput);
    }

    public boolean isStream() {
        return 1;
    }

    public boolean readBoolean() {
        try {
            return this.mCurrentInput.readBoolean();
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }
    }

    public Bundle readBundle() {
        int v0 = this.readInt();
        if(v0 < 0) {
            return null;
        }

        Bundle v1 = new Bundle();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            this.readObject(this.readInt(), this.readString(), v1);
        }

        return v1;
    }

    public byte[] readByteArray() {
        try {
            int v0_1 = this.mCurrentInput.readInt();
            if(v0_1 <= 0) {
                return null;
            }

            byte[] v0_2 = new byte[v0_1];
            this.mCurrentInput.readFully(v0_2);
            return v0_2;
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }

        return null;
    }

    public double readDouble() {
        try {
            return this.mCurrentInput.readDouble();
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }
    }

    public boolean readField(int arg6) {
        Object v0 = this.mCachedFields.get(arg6);
        if(v0 != null) {
            this.mCachedFields.remove(arg6);
            this.mCurrentInput = ((InputBuffer)v0).mInputStream;
            return 1;
        }

        try {
            while(true) {
                int v0_1 = this.mMasterInput.readInt();
                int v2 = 0xFFFF;
                int v3 = v0_1 & v2;
                if(v3 == v2) {
                    v3 = this.mMasterInput.readInt();
                }

                InputBuffer v4 = new InputBuffer(v0_1 >> 16 & v2, v3, this.mMasterInput);
                if(v4.mFieldId == arg6) {
                    this.mCurrentInput = v4.mInputStream;
                    return 1;
                }

                this.mCachedFields.put(v4.mFieldId, v4);
            }
        }
        catch(IOException ) {
            return 0;
        }
    }

    public float readFloat() {
        try {
            return this.mCurrentInput.readFloat();
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }
    }

    public int readInt() {
        try {
            return this.mCurrentInput.readInt();
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }
    }

    public long readLong() {
        try {
            return this.mCurrentInput.readLong();
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }
    }

    private void readObject(int arg3, String arg4, Bundle arg5) {
        switch(arg3) {
            case 0: {
                goto label_54;
            }
            case 1: {
                goto label_51;
            }
            case 2: {
                goto label_48;
            }
            case 3: {
                goto label_45;
            }
            case 4: {
                goto label_40;
            }
            case 5: {
                goto label_37;
            }
            case 6: {
                goto label_34;
            }
            case 7: {
                goto label_31;
            }
            case 8: {
                goto label_28;
            }
            case 9: {
                goto label_25;
            }
            case 10: {
                goto label_22;
            }
            case 11: {
                goto label_19;
            }
            case 12: {
                goto label_16;
            }
            case 13: {
                goto label_13;
            }
            case 14: {
                goto label_10;
            }
        }

        StringBuilder v5 = new StringBuilder();
        v5.append("Unknown type ");
        v5.append(arg3);
        throw new RuntimeException(v5.toString());
    label_34:
        arg5.putBooleanArray(arg4, this.readBooleanArray());
        return;
    label_37:
        arg5.putBoolean(arg4, this.readBoolean());
        return;
    label_40:
        arg5.putStringArray(arg4, this.readArray(new String[0]));
        return;
    label_10:
        arg5.putFloatArray(arg4, this.readFloatArray());
        return;
    label_45:
        arg5.putString(arg4, this.readString());
        return;
    label_13:
        arg5.putFloat(arg4, this.readFloat());
        return;
    label_48:
        arg5.putBundle(arg4, this.readBundle());
        return;
    label_16:
        arg5.putLongArray(arg4, this.readLongArray());
        return;
    label_51:
        arg5.putBundle(arg4, this.readBundle());
        return;
    label_19:
        arg5.putLong(arg4, this.readLong());
        return;
    label_54:
        arg5.putParcelable(arg4, null);
        return;
    label_22:
        arg5.putIntArray(arg4, this.readIntArray());
        return;
    label_25:
        arg5.putInt(arg4, this.readInt());
        return;
    label_28:
        arg5.putDoubleArray(arg4, this.readDoubleArray());
        return;
    label_31:
        arg5.putDouble(arg4, this.readDouble());
    }

    public Parcelable readParcelable() {
        return null;
    }

    public String readString() {
        try {
            int v0_1 = this.mCurrentInput.readInt();
            if(v0_1 <= 0) {
                return null;
            }

            byte[] v0_2 = new byte[v0_1];
            this.mCurrentInput.readFully(v0_2);
            return new String(v0_2, VersionedParcelStream.UTF_16);
        }
        catch(IOException v0) {
            throw new ParcelException(((Throwable)v0));
        }

        return null;
    }

    public IBinder readStrongBinder() {
        return null;
    }

    public void setOutputField(int arg3) {
        this.closeField();
        this.mFieldBuffer = new FieldBuffer(arg3, this.mMasterOutput);
        this.mCurrentOutput = this.mFieldBuffer.mDataStream;
    }

    public void setSerializationFlags(boolean arg1, boolean arg2) {
        if(arg1) {
            this.mIgnoreParcelables = arg2;
            return;
        }

        throw new RuntimeException("Serialization of this object is not allowed");
    }

    public void writeBoolean(boolean arg2) {
        try {
            this.mCurrentOutput.writeBoolean(arg2);
            return;
        }
        catch(IOException v2) {
            throw new ParcelException(((Throwable)v2));
        }
    }

    public void writeBundle(Bundle arg4) {
        if(arg4 != null) {
            try {
                Set v0 = arg4.keySet();
                this.mCurrentOutput.writeInt(v0.size());
                Iterator v0_1 = v0.iterator();
                while(true) {
                    if(v0_1.hasNext()) {
                        Object v1 = v0_1.next();
                        this.writeString(((String)v1));
                        this.writeObject(arg4.get(((String)v1)));
                        continue;
                    }

                    return;
                }

            label_15:
                this.mCurrentOutput.writeInt(-1);
                return;
            label_14:
                goto label_19;
            }
            catch(IOException v4) {
                goto label_14;
            }
        }
        else {
            goto label_15;
        label_19:
            throw new ParcelException(((Throwable)v4));
        }
    }

    public void writeByteArray(byte[] arg3) {
        if(arg3 != null) {
            try {
                this.mCurrentOutput.writeInt(arg3.length);
                this.mCurrentOutput.write(arg3);
                return;
            label_9:
                this.mCurrentOutput.writeInt(-1);
                return;
            label_8:
                goto label_13;
            }
            catch(IOException v3) {
                goto label_8;
            }
        }
        else {
            goto label_9;
        label_13:
            throw new ParcelException(((Throwable)v3));
        }
    }

    public void writeByteArray(byte[] arg2, int arg3, int arg4) {
        if(arg2 != null) {
            try {
                this.mCurrentOutput.writeInt(arg4);
                this.mCurrentOutput.write(arg2, arg3, arg4);
                return;
            label_8:
                this.mCurrentOutput.writeInt(-1);
                return;
            label_7:
                goto label_12;
            }
            catch(IOException v2) {
                goto label_7;
            }
        }
        else {
            goto label_8;
        label_12:
            throw new ParcelException(((Throwable)v2));
        }
    }

    public void writeDouble(double arg2) {
        try {
            this.mCurrentOutput.writeDouble(arg2);
            return;
        }
        catch(IOException v2) {
            throw new ParcelException(((Throwable)v2));
        }
    }

    public void writeFloat(float arg2) {
        try {
            this.mCurrentOutput.writeFloat(arg2);
            return;
        }
        catch(IOException v2) {
            throw new ParcelException(((Throwable)v2));
        }
    }

    public void writeInt(int arg2) {
        try {
            this.mCurrentOutput.writeInt(arg2);
            return;
        }
        catch(IOException v2) {
            throw new ParcelException(((Throwable)v2));
        }
    }

    public void writeLong(long arg2) {
        try {
            this.mCurrentOutput.writeLong(arg2);
            return;
        }
        catch(IOException v2) {
            throw new ParcelException(((Throwable)v2));
        }
    }

    private void writeObject(Object arg4) {
        if(arg4 == null) {
            this.writeInt(0);
        }
        else if((arg4 instanceof Bundle)) {
            this.writeInt(1);
            this.writeBundle(((Bundle)arg4));
        }
        else if((arg4 instanceof String)) {
            this.writeInt(3);
            this.writeString(((String)arg4));
        }
        else if((arg4 instanceof String[])) {
            this.writeInt(4);
            this.writeArray(((Object[])arg4));
        }
        else if((arg4 instanceof Boolean)) {
            this.writeInt(5);
            this.writeBoolean(((Boolean)arg4).booleanValue());
        }
        else if((arg4 instanceof boolean[])) {
            this.writeInt(6);
            this.writeBooleanArray(((boolean[])arg4));
        }
        else if((arg4 instanceof Double)) {
            this.writeInt(7);
            this.writeDouble(((Double)arg4).doubleValue());
        }
        else if((arg4 instanceof double[])) {
            this.writeInt(8);
            this.writeDoubleArray(((double[])arg4));
        }
        else if((arg4 instanceof Integer)) {
            this.writeInt(9);
            this.writeInt(((Integer)arg4).intValue());
        }
        else if((arg4 instanceof int[])) {
            this.writeInt(10);
            this.writeIntArray(((int[])arg4));
        }
        else if((arg4 instanceof Long)) {
            this.writeInt(11);
            this.writeLong(((Long)arg4).longValue());
        }
        else if((arg4 instanceof long[])) {
            this.writeInt(12);
            this.writeLongArray(((long[])arg4));
        }
        else if((arg4 instanceof Float)) {
            this.writeInt(13);
            this.writeFloat(((Float)arg4).floatValue());
        }
        else if((arg4 instanceof float[])) {
            this.writeInt(14);
            this.writeFloatArray(((float[])arg4));
        }
        else {
            goto label_87;
        }

        return;
    label_87:
        StringBuilder v1 = new StringBuilder();
        v1.append("Unsupported type ");
        v1.append(arg4.getClass());
        throw new IllegalArgumentException(v1.toString());
    }

    public void writeParcelable(Parcelable arg2) {
        if(this.mIgnoreParcelables) {
            return;
        }

        throw new RuntimeException("Parcelables cannot be written to an OutputStream");
    }

    public void writeString(String arg3) {
        if(arg3 != null) {
            try {
                byte[] v3_1 = arg3.getBytes(VersionedParcelStream.UTF_16);
                this.mCurrentOutput.writeInt(v3_1.length);
                this.mCurrentOutput.write(v3_1);
                return;
            label_11:
                this.mCurrentOutput.writeInt(-1);
                return;
            label_10:
                goto label_15;
            }
            catch(IOException v3) {
                goto label_10;
            }
        }
        else {
            goto label_11;
        label_15:
            throw new ParcelException(((Throwable)v3));
        }
    }

    public void writeStrongBinder(IBinder arg2) {
        if(this.mIgnoreParcelables) {
            return;
        }

        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    public void writeStrongInterface(IInterface arg2) {
        if(this.mIgnoreParcelables) {
            return;
        }

        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }
}

