package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY}) class VersionedParcelParcel extends VersionedParcel {
    private static final boolean DEBUG = false;
    private static final String TAG = "VersionedParcelParcel";
    private int mCurrentField;
    private final int mEnd;
    private int mNextRead;
    private final int mOffset;
    private final Parcel mParcel;
    private final SparseIntArray mPositionLookup;
    private final String mPrefix;

    VersionedParcelParcel(Parcel arg4) {
        this(arg4, arg4.dataPosition(), arg4.dataSize(), "");
    }

    VersionedParcelParcel(Parcel arg2, int arg3, int arg4, String arg5) {
        super();
        this.mPositionLookup = new SparseIntArray();
        this.mCurrentField = -1;
        this.mNextRead = 0;
        this.mParcel = arg2;
        this.mOffset = arg3;
        this.mEnd = arg4;
        this.mNextRead = this.mOffset;
        this.mPrefix = arg5;
    }

    public void closeField() {
        if(this.mCurrentField >= 0) {
            int v0 = this.mPositionLookup.get(this.mCurrentField);
            int v1 = this.mParcel.dataPosition();
            this.mParcel.setDataPosition(v0);
            this.mParcel.writeInt(v1 - v0);
            this.mParcel.setDataPosition(v1);
        }
    }

    protected VersionedParcel createSubParcel() {
        Parcel v1 = this.mParcel;
        int v2 = this.mParcel.dataPosition();
        int v3 = this.mNextRead == this.mOffset ? this.mEnd : this.mNextRead;
        StringBuilder v4 = new StringBuilder();
        v4.append(this.mPrefix);
        v4.append("  ");
        return new VersionedParcelParcel(v1, v2, v3, v4.toString());
    }

    public boolean readBoolean() {
        boolean v0 = this.mParcel.readInt() != 0 ? true : false;
        return v0;
    }

    public Bundle readBundle() {
        return this.mParcel.readBundle(this.getClass().getClassLoader());
    }

    public byte[] readByteArray() {
        int v0 = this.mParcel.readInt();
        if(v0 < 0) {
            return null;
        }

        byte[] v0_1 = new byte[v0];
        this.mParcel.readByteArray(v0_1);
        return v0_1;
    }

    public double readDouble() {
        return this.mParcel.readDouble();
    }

    public boolean readField(int arg2) {
        arg2 = this.readUntilField(arg2);
        if(arg2 == -1) {
            return 0;
        }

        this.mParcel.setDataPosition(arg2);
        return 1;
    }

    public float readFloat() {
        return this.mParcel.readFloat();
    }

    public int readInt() {
        return this.mParcel.readInt();
    }

    public long readLong() {
        return this.mParcel.readLong();
    }

    public Parcelable readParcelable() {
        return this.mParcel.readParcelable(this.getClass().getClassLoader());
    }

    public String readString() {
        return this.mParcel.readString();
    }

    public IBinder readStrongBinder() {
        return this.mParcel.readStrongBinder();
    }

    private int readUntilField(int arg4) {
        do {
            if(this.mNextRead >= this.mEnd) {
                return -1;
            }

            this.mParcel.setDataPosition(this.mNextRead);
            int v0 = this.mParcel.readInt();
            int v1 = this.mParcel.readInt();
            this.mNextRead += v0;
        }
        while(v1 != arg4);

        return this.mParcel.dataPosition();
    }

    public void setOutputField(int arg3) {
        this.closeField();
        this.mCurrentField = arg3;
        this.mPositionLookup.put(arg3, this.mParcel.dataPosition());
        this.writeInt(0);
        this.writeInt(arg3);
    }

    public void writeBoolean(boolean arg2) {
        this.mParcel.writeInt(((int)arg2));
    }

    public void writeBundle(Bundle arg2) {
        this.mParcel.writeBundle(arg2);
    }

    public void writeByteArray(byte[] arg3) {
        if(arg3 != null) {
            this.mParcel.writeInt(arg3.length);
            this.mParcel.writeByteArray(arg3);
        }
        else {
            this.mParcel.writeInt(-1);
        }
    }

    public void writeByteArray(byte[] arg3, int arg4, int arg5) {
        if(arg3 != null) {
            this.mParcel.writeInt(arg3.length);
            this.mParcel.writeByteArray(arg3, arg4, arg5);
        }
        else {
            this.mParcel.writeInt(-1);
        }
    }

    public void writeDouble(double arg2) {
        this.mParcel.writeDouble(arg2);
    }

    public void writeFloat(float arg2) {
        this.mParcel.writeFloat(arg2);
    }

    public void writeInt(int arg2) {
        this.mParcel.writeInt(arg2);
    }

    public void writeLong(long arg2) {
        this.mParcel.writeLong(arg2);
    }

    public void writeParcelable(Parcelable arg3) {
        this.mParcel.writeParcelable(arg3, 0);
    }

    public void writeString(String arg2) {
        this.mParcel.writeString(arg2);
    }

    public void writeStrongBinder(IBinder arg2) {
        this.mParcel.writeStrongBinder(arg2);
    }

    public void writeStrongInterface(IInterface arg2) {
        this.mParcel.writeStrongInterface(arg2);
    }
}

